package ru.saidgadjiev.leetcode._146;

import java.util.ArrayList;
import java.util.List;

public class HashMap {

    private static final float THRESHOLD = 0.75f;

    private static final int DEFAULT_CAPACITY = 10;

    private Bucket[] buckets;

    private int capacity;

    private int size;

    private List<Observer> observers = new ArrayList<>();

    public HashMap(int capacity) {
        int currentCapacity = Math.max(capacity, DEFAULT_CAPACITY);
        this.capacity = currentCapacity;
        this.buckets = new Bucket[currentCapacity];
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public int get(int key) {
        int hash = hash(key);

        Bucket binarySearchTree = buckets[hash];

        if (binarySearchTree == null) {
            return -1;
        }
        Entry node = binarySearchTree.findNode(key);

        if (node == null) {
            return -1;
        }

        observers.forEach(observer -> observer.get(node));

        return node.getValue();
    }

    public void put(int key, int value) {
        if (isNeedGrow()) {
            grow();
        }

        int hash = hash(key);
        Bucket bucket = buckets[hash];

        if (bucket == null) {
            bucket = newBucket();

            bucket.addOrUpdateNode(newEntry(key, value));
            buckets[hash] = bucket;
            ++size;

            Entry root = bucket.getRootEntry();
            observers.forEach(observer -> observer.put(root));
        } else {
            Bucket.AddNodeResult addNodeResult = bucket.addOrUpdateNode(newEntry(key, value));

            if (addNodeResult.isAdd()) {
                observers.forEach(observer -> observer.put(addNodeResult.getNode()));
            } else {
                observers.forEach(observer -> observer.update(addNodeResult.getNode()));
            }
        }
    }

    public void remove(int key) {
        int hash = hash(key);

        Bucket bucket = buckets[hash];

        if (bucket != null) {
            Entry removed = bucket.removeNode(key);

            observers.forEach(observer -> observer.remove(removed));
        }
    }

    private void rehashPut(Entry node) {
        int newHash = hash(node.getKey());
        Bucket bucket = buckets[newHash];

        if (bucket == null) {
            bucket = newBucket();

            bucket.addOrUpdateNode(node);
            buckets[newHash] = bucket;
        } else {
            bucket.addOrUpdateNode(node);
        }
    }

    private Entry newEntry(int key, int value) {
        return decorate(new EntryImpl(key, value));
    }

    private Bucket newBucket() {
        return new BST();
    }

    private void grow() {
        capacity *= 2;
        Bucket[] oldBuckets = buckets;

        buckets = new Bucket[capacity];

        for (Bucket binarySearchTree : oldBuckets) {
            if (binarySearchTree != null) {
                for (Entry node : binarySearchTree) {
                    rehashPut(node);
                }
            }
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    private boolean isNeedGrow() {
        return capacity * THRESHOLD <= size;
    }

    protected Entry decorate(Entry entry) {
        return entry;
    }

    public interface Entry {

        int getKey();

        int getValue();

        void setValue(int value);

    }

    private static class EntryImpl implements Entry {

        private int key;

        private int value;

        private EntryImpl(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int getKey() {
            return key;
        }

        @Override
        public int getValue() {
            return value;
        }

        @Override
        public void setValue(int value) {
            this.value = value;
        }
    }

    public interface Bucket extends Iterable<Entry> {

        Entry removeNode(int key);

        Entry getRootEntry();

        Entry findNode(int key);

        AddNodeResult addOrUpdateNode(Entry entry);

        class AddNodeResult {

            private final boolean add;

            private final Entry node;

            AddNodeResult(boolean add, Entry node) {
                this.add = add;
                this.node = node;
            }

            boolean isAdd() {
                return add;
            }

            Entry getNode() {
                return node;
            }
        }
    }

    public interface Observer {

        void get(Entry node);

        void put(Entry node);

        void update(Entry node);

        void remove(Entry node);
    }
}

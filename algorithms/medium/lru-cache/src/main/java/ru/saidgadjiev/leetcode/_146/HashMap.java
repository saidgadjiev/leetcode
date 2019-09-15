package ru.saidgadjiev.leetcode._146;

public class HashMap {

    private static final float THRESHOLD = 0.75f;

    private static final int DEFAULT_CAPACITY = 10;

    private ChainingStrategy[] buckets;

    private int capacity;

    private int size;

    public HashMap(int capacity) {
        int currentCapacity = capacity > DEFAULT_CAPACITY ? capacity : DEFAULT_CAPACITY;
        this.capacity = currentCapacity;
        this.buckets = new ChainingStrategy[currentCapacity];
    }

    private ChainingStrategy newStrategy() {
        return new BST();
    }

    private void rehashPut(Node node) {
        int newHash = hash(node.getKey());
        ChainingStrategy chainingStrategy = buckets[newHash];

        if (chainingStrategy == null) {
            buckets[newHash] = new LRUCache.BinarySearchTree(node);
        } else {
            chainingStrategy.addNode(node.getKey(), node.value);
        }
    }

    private void grow() {
        capacity *= 2;
        LRUCache.BinarySearchTree[] oldBuckets = buckets;

        buckets = new LRUCache.BinarySearchTree[capacity];

        for (LRUCache.BinarySearchTree binarySearchTree : oldBuckets) {
            if (binarySearchTree != null) {
                for (LRUCache.Node node : binarySearchTree) {
                    rehashPut(node);
                }
            }
        }
    }


    public int get(int key) {
        int hash = hash(key);

        LRUCache.BinarySearchTree binarySearchTree = buckets[hash];

        if (binarySearchTree == null) {
            return -1;
        }
        LRUCache.Node node = binarySearchTree.findNode(key);

        if (node == null) {
            return -1;
        }

        lruManager.updateNewestNode(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (isNeedGrow()) {
            grow();
        }

        int hash = hash(key);
        LRUCache.BinarySearchTree tree = buckets[hash];

        if (tree == null) {
            LRUCache.Node node = new LRUCache.Node(key, value);
            buckets[hash] = new LRUCache.BinarySearchTree(node);
            ++elementsAmount;
            ++size;

            lruManager.addNode(node);
        } else {
            LRUCache.BinarySearchTree.AddNodeResult addNodeResult = tree.addNode(key, value);
            if (addNodeResult.isAdd()) {
                ++elementsAmount;
                lruManager.addNode(addNodeResult.getNode());
            } else {
                afterAccessOrUpdate(addNodeResult.getNode());
            }
        }

        if (isNeedRemoveOldestEntry()) {
            removeOldestEntry();
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    private boolean isNeedGrow() {
        return capacity * THRESHOLD <= size;
    }

    private static class MapNode implements Node {

        private int key;

        private int value;

        private MapNode(int key, int value) {
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

    public interface Node {

        int getKey();

        int getValue();

        void setValue(int value);
    }
}

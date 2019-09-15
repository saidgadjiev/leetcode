package ru.saidgadjiev.leetcode._146;

public class LRUCache {

    private HashMap hashMap;

    private LRUManager lruManager = new LRUManager();

    private int elementsAmount;

    private int maxElementsAmount;

    public LRUCache(int capacity) {
        this.maxElementsAmount = capacity;
        this.hashMap = new HashMap(capacity);
    }

    public int get(int key) {
        return hashMap.get(key);
    }

    public void put(int key, int value) {
        hashMap.put(key, value);

        if (isNeedRemoveOldestEntry()) {
            removeOldestEntry();
        }
    }

    private boolean isNeedRemoveOldestEntry() {
        return elementsAmount > maxElementsAmount;
    }

    private void removeOldestEntry() {
        Node tail = lruManager.getOldest();
        int hash = hash(tail.getKey());

        BinarySearchTree binarySearchTree = buckets[hash];
        binarySearchTree.removeNode(tail.getKey());

        --elementsAmount;
        lruManager.removeOldest();
    }
    
    private void afterAccessOrUpdate(Node node) {
        lruManager.updateNewestNode(node);
    }
}

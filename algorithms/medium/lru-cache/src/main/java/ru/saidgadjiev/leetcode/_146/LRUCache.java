package ru.saidgadjiev.leetcode._146;

import ru.saidgadjiev.leetcode._146.HashMap.Entry;

public class LRUCache {

    private HashMap hashMap;

    private LRUManager lruManager = new LRUManager();

    private int elementsAmount;

    private int maxElementsAmount;

    public LRUCache(int capacity) {
        this.maxElementsAmount = capacity;
        this.hashMap = new HashMap(capacity) {
            @Override
            protected Entry decorate(Entry entry) {
                return lruManager.decorate(entry);
            }
        };

        hashMap.addObserver(new LRUCacheObserver());
        hashMap.addObserver(lruManager);
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
        Entry oldest = lruManager.getOldest();

        hashMap.remove(oldest.getKey());

        lruManager.removeOldest();
    }

    private class LRUCacheObserver implements HashMap.Observer {

        @Override
        public void get(Entry node) {

        }

        @Override
        public void put(Entry node) {
            ++elementsAmount;
        }

        @Override
        public void update(Entry node) {

        }

        @Override
        public void remove(Entry node) {
            --elementsAmount;
        }
    }
}

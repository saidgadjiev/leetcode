package ru.saidgadjiev.leetcode._146;

import ru.saidgadjiev.leetcode._146.HashMap.Bucket;
import ru.saidgadjiev.leetcode._146.HashMap.Entry;

import java.util.Iterator;

public class LinkedList implements Bucket {

    private LinkedNode root;

    @Override
    public Entry removeNode(int key) {
        if (root.getEntry().getKey() == key) {
            Entry removed = root.getEntry();
            root = null;

            return removed;
        } else {
            LinkedNode prev = root;
            LinkedNode tmp = root;

            while (tmp.getNext() != null && tmp.getNext().getEntry().getKey() != key) {
                prev = tmp;
                tmp = tmp.getNext();
            }

            if (tmp.getNext() == null) {
                prev.setNext(null);

                return tmp.getEntry();
            } else {
                Entry removed = tmp.getEntry();

                tmp.setNext(tmp.getNext().getNext());

                return removed;
            }
        }
    }

    @Override
    public Entry getRootEntry() {
        return root.getEntry();
    }

    @Override
    public Entry findNode(int key) {
        LinkedNode tmp = root;

        while (tmp != null && tmp.getEntry().getKey() != key) {
            tmp = tmp.getNext();
        }

        return tmp == null ? null : tmp.getEntry();
    }

    @Override
    public AddNodeResult addOrUpdateNode(Entry entry) {
        if (root == null) {
            root = new LinkedNode(entry);

            return new AddNodeResult(true, entry);
        } else {
            LinkedNode tmp = root;
            while (tmp.getNext() != null && tmp.getEntry().getKey() != entry.getKey()) {
                tmp = tmp.getNext();
            }
            if (tmp.getEntry().getKey() != entry.getKey()) {
                LinkedNode newNode = new LinkedNode(entry);

                tmp.setNext(newNode);

                return new AddNodeResult(true, entry);
            } else {
                tmp.getEntry().setValue(entry.getValue());

                return new AddNodeResult(false, tmp.getEntry());
            }
        }
    }

    @Override
    public Iterator<Entry> iterator() {
        return new LinkedListIterator(root);
    }

    private static class LinkedListIterator implements Iterator<Entry> {

        private LinkedNode root;

        public LinkedListIterator(LinkedNode root) {
            this.root = root;
        }

        @Override
        public boolean hasNext() {
            return root != null;
        }

        @Override
        public Entry next() {
            Entry entry = root.getEntry();

            root = root.getNext();

            return entry;
        }
    }

    private static class LinkedNode {

        private LinkedNode next;

        private Entry entry;

        public LinkedNode(Entry entry) {
            this.entry = entry;
        }

        public Entry getEntry() {
            return entry;
        }

        public LinkedNode getNext() {
            return next;
        }

        public void setNext(LinkedNode next) {
            this.next = next;
        }
    }
}

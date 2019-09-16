package ru.saidgadjiev.leetcode._146;

import ru.saidgadjiev.leetcode._146.HashMap.Entry;

public class LRUManager implements HashMap.Observer {

    private DoubleLinkedNode head;

    private DoubleLinkedNode tail;

    public Entry decorate(Entry entry) {
        return new DoubleLinkedNode(entry);
    }

    @Override
    public void get(Entry node) {
        updateNewestNode(node);
    }

    @Override
    public void put(Entry node) {
        addNode(node);
    }

    @Override
    public void update(Entry node) {
        updateNewestNode(node);
    }

    @Override
    public void remove(Entry node) {

    }

    private void addNode(Entry node) {
        DoubleLinkedNode doubleLinkedNode = (DoubleLinkedNode) node;

        if (head == null) {
            head = tail = doubleLinkedNode;
        } else {
            head.setPrev(doubleLinkedNode);
            doubleLinkedNode.setNext(head);
            head = doubleLinkedNode;
        }
    }

    private void updateNewestNode(Entry node) {
        DoubleLinkedNode doubleLinkedNode = (DoubleLinkedNode) node;

        if (isFirstNode(doubleLinkedNode)) {
            return;
        }
        if (isLastNode(doubleLinkedNode)) {
            DoubleLinkedNode lastNode = tail;

            tail.getPrev().setNext(null);
            tail = tail.getPrev();

            lastNode.setPrev(null);
            lastNode.setNext(head);
            head.setPrev(lastNode);

            head = lastNode;
        } else if (isMiddleNode(doubleLinkedNode)) {
            doubleLinkedNode.getPrev().setNext(doubleLinkedNode.getNext());
            doubleLinkedNode.getNext().setPrev(doubleLinkedNode.getPrev());

            doubleLinkedNode.setPrev(null);
            doubleLinkedNode.setNext(head);
            head.setPrev(doubleLinkedNode);

            head = doubleLinkedNode;
        }
    }

    public void removeOldest() {
        tail.getPrev().setNext(null);
        tail = tail.getPrev();
    }

    public Entry getOldest() {
        return tail;
    }

    private boolean isMiddleNode(DoubleLinkedNode node) {
        return node.getPrev() != null && node.getNext() != null;
    }

    private boolean isFirstNode(DoubleLinkedNode node) {
        return node.getPrev() == null;
    }

    private boolean isLastNode(DoubleLinkedNode node) {
        return node.getNext() == null;
    }

    private static class DoubleLinkedNode implements Entry {

        private DoubleLinkedNode prev;

        private DoubleLinkedNode next;

        private Entry entry;

        public DoubleLinkedNode(Entry entry) {
            this.entry = entry;
        }

        public DoubleLinkedNode getNext() {
            return next;
        }

        public void setNext(DoubleLinkedNode next) {
            this.next = next;
        }

        public DoubleLinkedNode getPrev() {
            return prev;
        }

        public void setPrev(DoubleLinkedNode prev) {
            this.prev = prev;
        }

        @Override
        public int getKey() {
            return entry.getKey();
        }

        @Override
        public int getValue() {
            return entry.getValue();
        }

        @Override
        public void setValue(int value) {
            entry.setValue(value);
        }
    }
}

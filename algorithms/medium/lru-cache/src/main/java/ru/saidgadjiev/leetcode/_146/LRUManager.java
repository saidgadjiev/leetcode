package ru.saidgadjiev.leetcode._146;

public class LRUManager {

    private LRUCache.Node head;

    private LRUCache.Node tail;

    private void addNode(LRUCache.Node node) {
        if (head == null) {
            head = tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    private void updateNewestNode(LRUCache.Node node) {
        if (isFirstNode(node)) {
            return;
        }
        if (isLastNode(node)) {
            LRUCache.Node lastNode = tail;

            tail.prev.next = null;
            tail = tail.prev;

            lastNode.prev = null;
            lastNode.next = head;
            head.prev = lastNode;

            head = lastNode;
        } else if (isMiddleNode(node)) {
            node.prev.next = node.next;
            node.next.prev = node.prev;

            node.prev = null;
            node.next = head;
            head.prev = node;

            head = node;
        }
    }

    private void removeOldest() {
        tail.prev.next = null;
        tail = tail.prev;
    }

    private LRUCache.Node getOldest() {
        return tail;
    }

    private boolean isMiddleNode(LRUCache.Node node) {
        return node.prev != null && node.next != null;
    }

    private boolean isFirstNode(LRUCache.Node node) {
        return node.prev == null;
    }

    private boolean isLastNode(LRUCache.Node node) {
        return node.next == null;
    }
}

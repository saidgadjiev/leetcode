package ru.saidgadjiev.leetcode._146;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import static ru.saidgadjiev.leetcode._146.HashMap.Bucket;
import static ru.saidgadjiev.leetcode._146.HashMap.Entry;

public class BST implements Bucket {

    private BSTNode root;

    @Override
    public Iterator<Entry> iterator() {
        return new BstIterator(root);
    }

    @Override
    public Entry removeNode(int key) {
        if (root.getEntry().getKey() == key) {
            Entry removed = root.node;

            root = root.getLeft() != null ? root.getLeft() : root.getRight();

            return removed;
        } else {
            return removeNode(root, null, key);
        }
    }

    @Override
    public Entry getRootEntry() {
        return root.getEntry();
    }

    @Override
    public Entry findNode(int key) {
        BSTNode node = findNode(root, key);

        return node == null ? null : node.getEntry();
    }

    @Override
    public AddNodeResult addOrUpdateNode(Entry entry) {
        if (root == null) {
            root = new BSTNode(entry);

            return new AddNodeResult(true, root.getEntry());
        } else {
            return addOrUpdateNode(root, entry);
        }
    }

    private AddNodeResult addOrUpdateNode(BSTNode root, Entry entry) {
        if (root.getEntry().getKey() == entry.getKey()) {
            root.getEntry().setValue(entry.getValue());

            return new AddNodeResult(false, root.getEntry());
        } else if (root.getEntry().getKey() < entry.getKey()) {
            if (root.getLeft() == null) {
                root.setLeft(new BSTNode(entry));

                return new AddNodeResult(true, entry);
            } else {
                return addOrUpdateNode(root.getLeft(), entry);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new BSTNode(entry));

                return new AddNodeResult(true, entry);
            } else {
                return addOrUpdateNode(root.getRight(), entry);
            }
        }
    }

    private BSTNode findNode(BSTNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.getEntry().getKey() == key) {
            return root;
        }
        if (root.getEntry().getKey() < key) {
            return findNode(root.getLeft(), key);
        } else {
            return findNode(root.getRight(), key);
        }
    }

    private Entry removeNode(BSTNode node, BSTNode parent, int key) {
        if (node.getEntry().getKey() < key) {
            if (node.getLeft() != null) {
                return removeNode(node.getLeft(), node, key);
            } else {
                return null;
            }
        } else if (node.getEntry().getKey() > key) {
            if (node.getRight() != null) {
                return removeNode(node.getRight(), node, key);
            } else {
                return null;
            }
        } else {
            if (node.getLeft() != null && node.getRight() != null) {
                node.getEntry().setValue(minValue(node.getRight()));

                return removeNode(node.getRight(), node, node.getEntry().getKey());
            } else if (parent.getLeft() == node) {
                parent.setLeft((node.getLeft() != null) ? node.getLeft() : node.getRight());
            } else if (parent.getRight() == node) {
                parent.setRight((node.getRight() != null) ? node.getRight() : node.getLeft());
            }

            return node.getEntry();
        }
    }

    private int minValue(BSTNode root) {
        if (root.getLeft() != null) {
            return root.getEntry().getValue();
        }

        return minValue(root.getRight());
    }

    private static class BstIterator implements Iterator<Entry> {

        private final Queue<BSTNode> nodes = new LinkedList<>();

        private BstIterator(BSTNode bstNode) {
            if (bstNode != null) {
                this.nodes.add(bstNode);
            }
        }

        @Override
        public boolean hasNext() {
            return nodes.size() > 0;
        }

        @Override
        public Entry next() {
            BSTNode node = nodes.poll();

            if (node == null) {
                return null;
            }
            if (node.getLeft() != null) {
                nodes.add(node.getLeft());
            }
            if (node.getRight() != null) {
                nodes.add(node.getRight());
            }

            return node.getEntry();
        }
    }

    private static class BSTNode {

        private BSTNode left;

        private BSTNode right;

        private final Entry node;

        private BSTNode(Entry node) {
            this.node = node;
        }

        private BSTNode getLeft() {
            return left;
        }

        private BSTNode getRight() {
            return right;
        }

        private void setLeft(BSTNode bstNode) {
            this.left = bstNode;
        }

        private void setRight(BSTNode bstNode) {
            this.right = bstNode;
        }

        private Entry getEntry() {
            return node;
        }
    }
}

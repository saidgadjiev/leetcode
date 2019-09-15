package ru.saidgadjiev.leetcode._146;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BST implements ChainingStrategy {

    private BstNode root;

    public BST(HashMap.Node root) {
        this.root = new BstNode(root);
    }

    @Override
    public Iterator<LRUCache.Node> iterator() {
        return new BstIterator(root);
    }

    private void removeNode(int key) {
        if (root.node.getKey() == key) {
            root = root.left != null ? root.left : root.right;
        } else {
            removeNode(root, null, key);
        }
    }

    private LRUCache.Node findNode(int key) {
        BstNode node = findNode(root, key);

        return node == null ? null : node.node;
    }

    private AddNodeResult addNode(int key, int value) {
        if (root == null) {
            root = new BstNode(new LRUCache.Node(key, value));

            return new AddNodeResult(true, root.node);
        } else {
            return addNode(root, key, value);
        }
    }

    private AddNodeResult addNode(BstNode root, int key, int value) {
        if (root.node.getKey() == key) {
            root.node.setValue(value);

            return new AddNodeResult(false, root.node);
        } else if (root.node.getKey() < key) {
            if (root.left == null) {
                LRUCache.Node node = new LRUCache.Node(key, value);

                root.left = new BstNode(node);

                return new AddNodeResult(true, node);
            } else {
                return addNode(root.left, key, value);
            }
        } else {
            if (root.right == null) {
                LRUCache.Node node = new LRUCache.Node(key, value);

                root.right = new BstNode(node);

                return new AddNodeResult(true, node);
            } else {
                return addNode(root.right, key, value);
            }
        }
    }

    private BstNode findNode(BstNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.node.getKey() == key) {
            return root;
        }
        if (root.node.getKey() < key) {
            return findNode(root.left, key);
        } else {
            return findNode(root.right, key);
        }
    }

    private void removeNode(BstNode root, BstNode parent, int key) {
        if (root.node.getKey() < key) {
            if (root.left != null) {
                removeNode(root.left, root, key);
            }
        } else if (root.node.getKey() > key) {
            if (root.right != null) {
                removeNode(root.right, root, key);
            }
        } else {
            if (root.left != null && root.right != null) {
                root.node.setValue(minValue(root.right));

                removeNode(root.right, root, root.node.getKey());
            } else if (parent.left == root) {
                parent.left = (root.left != null) ? root.left : root.right;
            } else if (parent.right == root) {
                parent.right = (root.right != null) ? root.right : root.left;
            }
        }
    }

    private int minValue(BstNode root) {
        if (root.left == null) {
            return root.node.getValue();
        }

        return minValue(root.right);
    }

    private static class BstIterator implements Iterator<LRUCache.Node> {

        private final Queue<BstNode> nodes = new LinkedList<>();

        private BstIterator(BstNode bstNode) {
            this.nodes.add(bstNode);
        }

        @Override
        public boolean hasNext() {
            return nodes.size() > 0;
        }

        @Override
        public LRUCache.Node next() {
            BstNode node = nodes.poll();

            if (node == null) {
                return null;
            }
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }

            return node.node;
        }
    }

    private class AddNodeResult {

        private final boolean add;

        private final LRUCache.Node node;

        private AddNodeResult(boolean add, LRUCache.Node node) {
            this.add = add;
            this.node = node;
        }

        private boolean isAdd() {
            return add;
        }

        private LRUCache.Node getNode() {
            return node;
        }
    }

    private static class BstNode {

        private BstNode left;

        private BstNode right;

        private final LRUCache.Node node;

        private BstNode(LRUCache.Node node) {
            this.node = node;
        }
    }
}

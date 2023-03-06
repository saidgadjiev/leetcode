package ru.saidgadjiev.leetcode.easy._589;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root != null) {
            result.add(root.val);
            if (root.children != null) {
                for (Node child : root.children) {
                    result.addAll(preorder(child));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.children = new ArrayList<>();
        Node node1 = new Node(3);
        node.children.add(node1);
        node.children.add(new Node(2));
        node.children.add(new Node(4));

        node1.children = new ArrayList<>();
        node1.children.add(new Node(5));
        node1.children.add(new Node(6));

        List<Integer> preorder = new Solution().preorder(node);
        System.out.println(preorder);
    }

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}

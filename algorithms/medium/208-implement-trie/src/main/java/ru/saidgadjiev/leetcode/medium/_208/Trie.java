package ru.saidgadjiev.leetcode.medium._208;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    private final TrieNode trie = new TrieNode(null);//root node

    public Trie() {

    }

    public void insert(String word) {
        TrieNode tmp = trie;
        for (char c : word.toCharArray()) {
            TrieNode trieNode = tmp.children.stream().filter(t -> c == t.ch).findFirst().orElse(null);
            if (trieNode == null) {
                trieNode = new TrieNode(c);
                tmp.children.add(trieNode);
            }
            tmp = trieNode;
        }
        tmp.word = word;
    }

    public boolean search(String word) {
        TrieNode tmp = trie;
        for (char c : word.toCharArray()) {
            TrieNode trieNode = tmp.children.stream().filter(t -> c == t.ch).findFirst().orElse(null);
            if (trieNode == null) {
                return false;
            }
            tmp = trieNode;
        }

        return word.equals(tmp.word);
    }

    public boolean startsWith(String prefix) {
        TrieNode tmp = trie;
        for (char c : prefix.toCharArray()) {
            TrieNode trieNode = tmp.children.stream().filter(t -> c == t.ch).findFirst().orElse(null);
            if (trieNode == null) {
                return false;
            }
            tmp = trieNode;
        }

        return true;
    }

    private static class TrieNode {
        private final List<TrieNode> children = new ArrayList<>();
        private final Character ch;
        private String word;

        TrieNode(Character ch) {
            this.ch = ch;
        }
    }
}

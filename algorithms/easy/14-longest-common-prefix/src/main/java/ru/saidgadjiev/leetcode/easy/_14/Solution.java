package ru.saidgadjiev.leetcode.easy._14;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 * "flower","flow","flight"
 * f
 * l
 * o    i   a
 * w    o     g  s
 * e         r      h  h
 * r                   t
 * <p>
 * ()-> f
 * f -> l
 * l -> o i a
 * o -> w o
 * <p>
 * null -> map(null, [f])
 * f -> map(l, [o])
 * <p>
 * aaa aa aaa
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        TrieNode trie = new TrieNode(null);//root node

        for (String str : strs) {
            if (str.isEmpty()) {
                return "";
            }
        }
        String result = pushToTrie(trie, strs[0]);
        for (int i = 1; i < strs.length; i++) {
            String newCommonPrefix = pushToTrie(trie, strs[i]);
            result = newCommonPrefix.length() < result.length() ? newCommonPrefix : result;
        }

        return result;
    }

    private String pushToTrie(TrieNode trie, String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            TrieNode trieNode = trie.children.stream().filter(t -> c == t.ch).findFirst().orElse(null);
            if (trieNode == null) {
                trieNode = new TrieNode(c);
                trie.children.add(trieNode);
            }
            if (trie.children.size() > 1) {
                return result.toString();
            }
            result.append(c);
            trie = trieNode;
        }

        return result.toString();
    }

    private static class TrieNode {
        private final List<TrieNode> children = new ArrayList<>();
        private final Character ch;

        TrieNode(Character ch) {
            this.ch = ch;
        }
    }
}

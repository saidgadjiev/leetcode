package ru.saidgadjiev.leetcode.medium._208;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Trie {

    private final TrieNode searchTrie = new TrieNode();

    public Trie() {

    }

    public void insert(String word) {
        char firstCh = word.charAt(0);
        searchTrie.trieMap.putIfAbsent(firstCh, new TrieNode());
        TrieNode prevTrie = searchTrie.trieMap.get(firstCh);
        prevTrie.words.add(word);

        for (int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);
            prevTrie.trieMap.putIfAbsent(ch, new TrieNode());
            prevTrie = prevTrie.trieMap.get(ch);
            prevTrie.words.add(word);
        }
    }

    public boolean search(String word) {
        char firstChar = word.charAt(0);
        TrieNode targetTrie = searchTrie.trieMap.get(firstChar);

        return targetTrie != null && targetTrie.words.contains(word);
    }

    public boolean startsWith(String prefix) {
        char firstChar = prefix.charAt(0);
        TrieNode targetTrie = searchTrie.trieMap.get(firstChar);

        for (int i = 1; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (targetTrie == null) {
                break;
            }
            targetTrie = targetTrie.trieMap.get(ch);
        }

        return targetTrie != null;
    }

    private static final class TrieNode {

        private final Map<Character, TrieNode> trieMap = new LinkedHashMap<>();

        private final Set<String> words = new TreeSet<>();
    }
}

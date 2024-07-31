package ru.saidgadjiev.leetcode.algorithms._1268;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/search-suggestions-system
 */
public class Solution {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();

        SearchTrie searchTrie = buildSearchTrie(Arrays.asList(products));

        String query = "";

        for (char c : searchWord.toCharArray()) {
            query += c;
            List<String> searchResults = searchQuery(searchTrie, query);

            result.add(top3Lexicographically(searchResults));
        }

        return result;
    }

    private List<String> top3Lexicographically(List<String> searchResults) {
        List<String> finalResult = new ArrayList<>();
        for (String searchResult : searchResults) {
            if (finalResult.size() >= 3) {
                break;
            }
            finalResult.add(searchResult);
        }

        return finalResult;
    }

    private List<String> searchQuery(SearchTrie searchTrie, String query) {
        char firstChar = query.charAt(0);
        Trie targetTrie = searchTrie.searchTries.get(firstChar);

        for (char ch : query.toCharArray()) {
            if (targetTrie == null) {
                break;
            }
            targetTrie = targetTrie.trieMap.get(ch);
        }

        return targetTrie == null ? List.of() : new ArrayList<>(targetTrie.words);
    }

    private SearchTrie buildSearchTrie(List<String> products) {
        Set<Character> trieRoots = new HashSet<>();
        for (String product : products) {
            trieRoots.add(product.charAt(0));
        }

        SearchTrie searchTrie = new SearchTrie();
        for (Character trieRootChar : trieRoots) {
            Trie trie = new Trie();
            searchTrie.searchTries.put(trieRootChar, trie);

            for (String product : products) {
                if (product.charAt(0) == trieRootChar) {
                    addWordToTrie(trie, product);
                }
            }
        }

        return searchTrie;
    }

    private void addWordToTrie(Trie trie, String word) {
        char firstCh = word.charAt(0);
        trie.trieMap.putIfAbsent(firstCh, new Trie());
        Trie prevTrie = trie.trieMap.get(firstCh);
        prevTrie.words.add(word);

        for (int i = 1; i < word.length(); i++) {
            char ch = word.charAt(i);
            prevTrie.trieMap.putIfAbsent(ch, new Trie());
            prevTrie = prevTrie.trieMap.get(ch);
            prevTrie.words.add(word);
        }
    }

    private static final class SearchTrie {

        private final Map<Character, Trie> searchTries = new HashMap<>();
    }

    private static final class Trie {

        private final Map<Character, Trie> trieMap = new LinkedHashMap<>();

        private final Set<String> words = new TreeSet<>();
    }
}

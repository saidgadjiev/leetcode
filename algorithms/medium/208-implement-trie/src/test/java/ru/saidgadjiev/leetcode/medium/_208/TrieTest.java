package ru.saidgadjiev.leetcode.medium._208;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TrieTest {

    @Test
    public void case1() {
        Trie trie = new Trie();
        trie.insert("apple");
        Assertions.assertTrue(trie.search("apple"));   // return True
        Assertions.assertFalse(trie.search("app"));     // return False
        Assertions.assertTrue(trie.startsWith("app")); // return True
        trie.insert("app");
        Assertions.assertTrue(trie.search("app"));     // return True
    }

}
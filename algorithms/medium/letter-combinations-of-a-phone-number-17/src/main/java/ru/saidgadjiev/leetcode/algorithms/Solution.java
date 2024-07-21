package ru.saidgadjiev.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {

    private static final Map<Character, List<Character>> NUMBER_LETTERS_MAP = Map.of(
        '2', List.of('a', 'b', 'c'),
        '3', List.of('d', 'e', 'f'),
        '4', List.of('g', 'h', 'i'),
        '5', List.of('j', 'k', 'l'),
        '6', List.of('m', 'n', 'o'),
        '7', List.of('p', 'q', 'r', 's'),
        '8', List.of('t', 'u', 'v'),
        '9', List.of('w', 'x', 'y', 'z')
    );

    public List<String> letterCombinations(String digits) {
        if (digits.isBlank()) {
            return List.of();
        }
        List<String> result = new ArrayList<>();

        letterCombinations(digits, 0, "", result);

        return result;
    }

    public void letterCombinations(String digits, int nextDigitIndex, String combination, List<String> result) {
        if (nextDigitIndex >= digits.length()) {
            result.add(combination);
            return;
        }
        char digit = digits.charAt(nextDigitIndex);

        for (Character letter : NUMBER_LETTERS_MAP.get(digit)) {
            String nextCombination = combination + letter;
            letterCombinations(digits, nextDigitIndex + 1, nextCombination, result);
        }
    }
}

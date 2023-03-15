package ru.saidgadjiev.leetcode.easy._394;

import java.util.Stack;

/**
 * https://leetcode.com/problems/decode-string/description/
 * state
 * -1 - undefined
 * 0 - letter
 * 1 - digit and repeat
 * 2 - open bracket
 * 3 - close bracket
 * 2[abc]3[cd]ef
 * 2
 */
public class Solution {
    public String decodeString(String s) {
        Stack<String> strings = new Stack<>();
        Stack<Integer> repeats = new Stack<>();
        int number = 0;
        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + c - '0';
            } else if (c == '[') {
                strings.push(word.toString());
                repeats.push(number);
                number = 0;
                word = new StringBuilder();
            } else if (c == ']') {
                String prevWord = word.toString();
                int repeat = repeats.pop();
                word = new StringBuilder(strings.pop());
                word.append(prevWord.repeat(repeat));
            } else {
                word.append(c);
            }
        }

        return word.toString();
    }
}

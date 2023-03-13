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
        String numberStr = "";
        String word = "";

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                numberStr += c;
            } else if (c == '[') {
                strings.push(word);
                word = "";
                repeats.push(Integer.parseInt(numberStr));
                numberStr = "";
            } else if (c == ']') {
                String temp = word;
                word = strings.pop();
                int repeat = repeats.pop();
                word += temp.repeat(repeat);
            } else {
                word += c;
            }
        }

        return word;
    }
}

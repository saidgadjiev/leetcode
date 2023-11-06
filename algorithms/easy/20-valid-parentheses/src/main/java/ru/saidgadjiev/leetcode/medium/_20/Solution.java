package ru.saidgadjiev.leetcode.medium._20;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> openBrackets = Map.of('{', '}', '(', ')', '[', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (openBrackets.containsKey(c)) {
                stack.push(c);
            } else {
                char lastOpenBracket = stack.isEmpty() ? '#' : stack.pop();
                if (c != openBrackets.get(lastOpenBracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

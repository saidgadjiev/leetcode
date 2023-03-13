package ru.saidgadjiev.leetcode._844;

import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare
 */
public class Solution {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> characters = pushToStack(s);
        Stack<Character> characters1 = pushToStack(t);

        while (!characters.isEmpty() && !characters1.isEmpty()) {
            if (characters.pop() != characters1.pop()) {
                return false;
            }
        }

        return characters.isEmpty() && characters1.isEmpty();
    }

    private Stack<Character> pushToStack(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(aChar);
            }
        }

        return stack;
    }

    public static void main(String[] args) {

    }
}

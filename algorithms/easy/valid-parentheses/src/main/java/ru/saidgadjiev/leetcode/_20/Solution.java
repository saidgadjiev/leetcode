package ru.saidgadjiev.leetcode._20;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<>();

        for (char ch: s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    bracketStack.push(ch);
                    break;
                case ')': {
                    if (isNotValidBracket('(', bracketStack)) {
                        return false;
                    }

                    break;
                }
                case '}': {
                    if (isNotValidBracket('{', bracketStack)) {
                        return false;
                    }

                    break;
                }
                case ']':{
                    if (isNotValidBracket('[', bracketStack)) {
                        return false;
                    }

                    break;
                }
            }
        }

        return bracketStack.isEmpty();
    }

    private boolean isNotValidBracket(char bracket, Stack<Character> bracketStack) {
        if (bracketStack.isEmpty()) {
            return true;
        }
        char pop = bracketStack.pop();

        return pop != bracket;
    }
}

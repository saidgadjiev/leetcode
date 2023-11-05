package ru.gadjini.leetcode._744;

public class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        char greatest = letters[0];
        int i = 0; int j = letters.length - 1;

        while (i <= j ) {
            int mid = i + (j - i) / 2;
            if (letters[mid] > target) {
                greatest = letters[mid];
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return greatest;
    }
}

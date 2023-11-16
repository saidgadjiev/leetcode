package ru.saidgadjiev.leetcode._125;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class Solution {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char chOne = s.charAt(i);
            char chTwo = s.charAt(j);

            if (!Character.isAlphabetic(chOne) && !Character.isDigit(chOne)) {
                ++i;
                continue;
            }
            if (!Character.isAlphabetic(chTwo) && !Character.isDigit(chTwo)) {
                --j;
                continue;
            }
            if (Character.toLowerCase(chOne) != Character.toLowerCase(chTwo)) {
                return false;
            }
            ++i;
            --j;
        }

        return true;
    }
}

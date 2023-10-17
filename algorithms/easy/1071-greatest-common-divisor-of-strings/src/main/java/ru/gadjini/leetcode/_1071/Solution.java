package ru.gadjini.leetcode._1071;

/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 */
public class Solution {

    public boolean isValid(String str1, String str2, int k) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 % k > 0 || len2 % k > 0) {
            return false;
        } else {
            String base = str1.substring(0, k);

            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i = Math.min(len1, len2); i > 0; i--) {
            if (isValid(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }

        return "";
    }
}

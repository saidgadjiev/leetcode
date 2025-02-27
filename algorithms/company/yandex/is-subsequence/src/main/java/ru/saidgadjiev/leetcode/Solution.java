package ru.saidgadjiev.leetcode;

/**
 * Берем первую букву из s и ищем ее в t
 * После этого переходим к поиску следующей буквы из s
 * Если все буквы из s найдены значит строки изоморфны и остальные буквы могут быть удалены
 */
public class Solution {

    public boolean isSubsequence(String s, String t) {
        int si = 0;

        for (int ti = 0; ti < t.length() && si < s.length(); ++ti) {
            char targetS = s.charAt(si);

            if (t.charAt(ti) == targetS) {
                si++;
            }
        }

        return si == s.length();
    }
}

package ru.gadjini.leetcode._345;

public class Solution {

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i < j) {
            if (!isVowel(s.charAt(i))) {
                ++i;
            } else if (!isVowel(s.charAt(j))) {
                --j;
            } else {
                swap(chars, i, j);
                ++i;
                --j;
            }
        }

        return new String(chars);
    }

    private void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

package ru.saidgadjiev.leetcode.easy._784;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.  Return a list of all possible strings we could create.
 * <p>
 * Examples:
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 * <p>
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 * <p>
 * Input: S = "12345"
 * Output: ["12345"]
 * Note:
 * <p>
 * S will be a string with length between 1 and 12.
 * S will consist only of letters or digits.
 * <p>
 * a1b2 = 000
 * a1B2 = 001
 * A1b2 = 010
 * A1B2 = 011
 */
public class Solution {

    public List<String> letterCasePermutation(String S) {
        int bits = 0;

        for (char ch : S.toCharArray()) {
            if (Character.isLetter(ch)) {
                ++bits;
            }
        }
        List<String> result = new ArrayList<>();

        for (int i = 0; i < 1 << bits; ++i) {
            int b = bits - 1;
            StringBuilder permuration = new StringBuilder();

            for (char ch : S.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (((i >> b--) & 1) == 1) {
                        permuration.append(Character.toUpperCase(ch));
                    } else {
                        permuration.append(Character.toLowerCase(ch));
                    }
                } else {
                    permuration.append(ch);
                }
            }
            result.add(permuration.toString());
        }

        return result;
    }
}

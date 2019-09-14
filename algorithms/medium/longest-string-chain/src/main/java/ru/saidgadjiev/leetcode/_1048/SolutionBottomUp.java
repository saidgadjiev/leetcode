package ru.saidgadjiev.leetcode._1048;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list of words, each word consists of English lowercase letters.
 * <p>
 * Let's say word1 is a predecessor of word2 if and only if we can add exactly one letter anywhere in word1 to make it equal to word2.  For example, "abc" is a predecessor of "abac".
 * <p>
 * A word chain is a sequence of words [word_1, word_2, ..., word_k] with k >= 1, where word_1 is a predecessor of word_2, word_2 is a predecessor of word_3, and so on.
 * <p>
 * Return the longest possible length of a word chain with words chosen from the given list of words.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["a","b","ba","bca","bda","bdca"]
 * Output: 4
 * Explanation: one of the longest word chain is "a","ba","bda","bdca".
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= words.length <= 1000
 * 1 <= words[i].length <= 16
 * words[i] only consists of English lowercase letters.
 *
 * Сначала группируем все слова по длинам. Далее удаляем по одному символу из слов с самой большой длиной и смотрим дает ли вклад
 * на предыдущие слова текущее слово. Например слово bdca удаляем d = bca это дает вклад к слову bda + 1 и так далее.
 * Слово bda - длина 2 удаляем букву d ba - 2 + 1 = 3. Слово ba - 3 удаляем b a - 3 + 1 = 4. то есть мы говорим что есть цепочка длиной 4 начиная от a.
 */
public class SolutionBottomUp {

    public int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        List<String>[] groupsByLength = new List[17];

        for (String word: words) {
            dp.put(word, 1);

            int length = word.length();
            if (groupsByLength[length] == null) {
                groupsByLength[length] = new ArrayList<>();
            }
            groupsByLength[length].add(word);
        }

        for (int g = 16; g > 1; --g) {
            if (groupsByLength[g] == null || groupsByLength[g - 1] == null) {
                continue;
            }

            for (String word : groupsByLength[g]) {
                int chain = dp.get(word);

                for (int i = 0; i < word.length(); ++i) {
                    String nextWord = word.substring(0, i) + word.substring(i + 1);

                    if (dp.containsKey(nextWord)) {
                        dp.put(nextWord, Math.max(dp.get(nextWord), chain + 1));
                    }
                }
            }
        }
        int max = 0;

        for (int chain : dp.values()) {
            max = Math.max(max, chain);
        }

        return max;
    }
}

package ru.gadjini.leetcode._1456;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        int abciiidef = new Solution().maxVowels("abciiidef", 3);
        Assertions.assertEquals(3, abciiidef);
    }

    @Test
    void case2() {
        int abciiidef = new Solution().maxVowels("aeiou", 2);
        Assertions.assertEquals(2, abciiidef);
    }

    @Test
    void case3() {
        int abciiidef = new Solution().maxVowels("leetcode", 3);
        Assertions.assertEquals(2, abciiidef);
    }

    @Test
    void case4() {
        int abciiidef = new Solution().maxVowels("vdvsvvrbjjjjjjj", 3);
        Assertions.assertEquals(0, abciiidef);
    }
}
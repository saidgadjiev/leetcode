package ru.saidgadjiev.leetcode._1048;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestStrChain() {
        int result = new Solution().longestStrChain(new String[] { "a","b","ba","bca","bda","bdca" });

        Assertions.assertEquals(4, result);
    }

    @Test
    void longestStrChainBottomUp() {
        int result = new SolutionBottomUp().longestStrChain(new String[] { "ksqvsyq","ks","kss","czvh","zczpzvdhx","zczpzvh","zczpzvhx","zcpzvh","zczvh","gr","grukmj","ksqvsq","gruj","kssq","ksqsq","grukkmj","grukj","zczpzfvdhx","gru" });

        Assertions.assertEquals(4, result);
    }
}
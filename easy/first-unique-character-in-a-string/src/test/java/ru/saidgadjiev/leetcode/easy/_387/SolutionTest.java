package ru.saidgadjiev.leetcode.easy._387;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstUniqChar() {
        int index = new Solution().firstUniqChar("loveleetcode");

        Assertions.assertEquals(2, index);
    }
}
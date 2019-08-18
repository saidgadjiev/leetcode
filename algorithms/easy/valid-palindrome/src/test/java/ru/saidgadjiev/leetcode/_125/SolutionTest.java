package ru.saidgadjiev.leetcode._125;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrome() {
        boolean result = new Solution().isPalindrome(".,");

        Assertions.assertTrue(result);

        result = new Solution().isPalindrome("ab");

        Assertions.assertFalse(result);
    }
}
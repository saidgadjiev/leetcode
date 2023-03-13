package ru.saidgadjiev.leetcode._844;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void backspaceCompare() {
        Solution solution = new Solution();
        Assertions.assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
        Assertions.assertTrue(solution.backspaceCompare("ab##", "c#d#"));
        Assertions.assertFalse(solution.backspaceCompare("a#c", "b"));
    }
}
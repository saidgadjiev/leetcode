package ru.saidgadjiev.leetcode._424;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void characterReplacement() {
        Solution solution = new Solution();
        Assertions.assertEquals(6, solution.characterReplacement("ABABPAABAABB", 2));
        Assertions.assertEquals(3, solution.characterReplacement("AAAB", 0));
        Assertions.assertEquals(2, solution.characterReplacement("ABABPAABAABB", 0));
        Assertions.assertEquals(4, solution.characterReplacement("ABAB", 2));
        Assertions.assertEquals(4, solution.characterReplacement("AABABBA", 1));
        Assertions.assertEquals(4, solution.characterReplacement("ABBB", 2));
        Assertions.assertEquals(5, solution.characterReplacement("BAAAB", 2));
       // Assertions.assertEquals(12, solution.characterReplacement("EOEMQLLQTRQDDCOERARHGAAARRBKCCMFTDAQOLOKARBIJBISTGNKBQGKKTALSQNFSABASNOPBMMGDIOETPTDICRBOMBAAHINTFLH", 7));
        Assertions.assertEquals(11, solution.characterReplacement("EOEMQLLQTRQDDCOERARHGAAARRBKCCMFTDAQOLOKARBIJBISTGNKBQGKKTALSQNFSABASNOPBMMGDIOETPTDICRBOMBAAHINTFLH", 7));
    }
}
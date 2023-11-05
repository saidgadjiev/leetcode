package ru.gadjini.leetcode._744;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        char a = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a');

        Assertions.assertEquals('c', a);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        char a = solution.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c');

        Assertions.assertEquals('f', a);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        char a = solution.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z');

        Assertions.assertEquals('x', a);
    }
}
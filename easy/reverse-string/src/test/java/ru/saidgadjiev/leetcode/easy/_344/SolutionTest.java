package ru.saidgadjiev.leetcode.easy._344;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseString() {
        char[] s = new char[] { 'H','a','n','n','a','h' };

        new Solution().reverseString(s);

        Assertions.assertArrayEquals(new char[] { 'o','l','l','e','h' }, s);
    }
}
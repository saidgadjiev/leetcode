package ru.saidgadjiev.leetcode.medium._49;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    @Test
    public void case1() {
        Solution solution = new Solution();
        List<List<String>> lists = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assertions.assertEquals(List.of(List.of("bat"), List.of("nat", "tan"),
                List.of("ate", "eat", "tea")), lists);
    }
}
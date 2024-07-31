package ru.saidgadjiev.leetcode.algorithms._1268;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<List<String>> res = solution.suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor",
            "mousepad"}, "mouse");

        Assertions.assertEquals(List.of(List.of("mobile","moneypot","monitor"), List.of("mobile","moneypot","monitor"),
            List.of("mouse","mousepad"), List.of("mouse","mousepad"), List.of("mouse","mousepad")), res);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<List<String>> havana = solution.suggestedProducts(new String[]{"havana"}, "havana");

        Assertions.assertEquals(List.of(List.of("havana"), List.of("havana"),
            List.of("havana"), List.of("havana"), List.of("havana"), List.of("havana")), havana);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        List<List<String>> tatiana = solution.suggestedProducts(new String[]{"havana"}, "tatiana");

        Assertions.assertEquals(List.of(), tatiana);
    }
}

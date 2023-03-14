package ru.saidgadjiev.leetcode.easy._692;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        Assertions.assertEquals(List.of("i","love"),
                solution.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2));
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        Assertions.assertEquals(List.of("the","is","sunny","day"),
                solution.topKFrequent(new String[] {"the","day","is","sunny","the","the","the","sunny","is","is"},
                4));
    }
}
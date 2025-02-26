package ru.saidgadjiev.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void case1() {
        Solution solution = new Solution();
        List<String> itinerary = solution.findItinerary(List.of(List.of("MUC", "LHR"),
            List.of("JFK", "MUC"), List.of("SFO", "SJC"), List.of("LHR", "SFO")
        ));

        Assertions.assertEquals(List.of("JFK", "MUC", "LHR", "SFO", "SJC"), itinerary);
    }

    @Test
    void case2() {
        Solution solution = new Solution();
        List<String> itinerary = solution.findItinerary(List.of(List.of("JFK", "SFO"),
            List.of("JFK", "ATL"), List.of("SFO", "ATL"), List.of("ATL", "JFK"), List.of("ATL", "SFO")
        ));

        Assertions.assertEquals(List.of("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"), itinerary);
    }

    @Test
    void case3() {
        Solution solution = new Solution();
        List<String> itinerary = solution.findItinerary(List.of(
            List.of("JFK", "KUL"),
            List.of("JFK", "NRT"),
            List.of("NRT", "JFK")
        ));

        Assertions.assertEquals(List.of("JFK", "NRT", "JFK", "KUL"), itinerary);
    }
}

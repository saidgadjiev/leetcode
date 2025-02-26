package ru.saidgadjiev.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {

    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> targets = new HashMap<>();

        for (List<String> ticket : tickets) {
            targets.computeIfAbsent(ticket.get(0), s -> new PriorityQueue<>())
                .add(ticket.get(1));
        }

        List<String> route = new ArrayList<>();
        visit("JFK", targets, route);

        return route;
    }

    private void visit(String airport, Map<String, PriorityQueue<String>> targets, List<String> route) {
        while(targets.containsKey(airport) && !targets.get(airport).isEmpty()) {
            visit(targets.get(airport).poll(), targets, route);
        }

        route.add(0, airport);
    }
}

package ru.saidgadjiev.leetcode.medium._787;

import java.util.*;

/**
 * https://leetcode.com/problems/cheapest-flights-within-k-stops
 * Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
 * Output: 700
 */
public class Solution {

    private static class ConnectedFlight {

        private final int to;

        private final int cost;

        public ConnectedFlight(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    private final Map<Integer, List<ConnectedFlight>> connections = new HashMap<>();

    private int minPrice = Integer.MAX_VALUE;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        if (flights.length == 0) {
            return 0;
        }
        for (int[] flight : flights) {
            connections.putIfAbsent(flight[0], new ArrayList<>());
            connections.get(flight[0]).add(new ConnectedFlight(flight[1], flight[2]));
        }

        findCheapestPrice(src, dst, k + 1, 0, new HashSet<>());

        return minPrice == Integer.MAX_VALUE ? -1 : minPrice;
    }

    private void findCheapestPrice(int from, int to, int k, int price, Set<Integer> visited) {
        if (k >= 0 && from == to) {
            minPrice = Math.min(minPrice, price);
            return;
        }

        visited.add(from);
        for (ConnectedFlight connectedFlight : connections.getOrDefault(from, new ArrayList<>())) {
            if (!visited.contains(connectedFlight.to)) {
                findCheapestPrice(connectedFlight.to,
                        to, k - 1, connectedFlight.cost + price, visited);
            }
        }
        visited.remove(from);
    }
}

package ru.gadjini.leetcode._1431;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxAmongAll = candies[0];
        for (int i = 1; i < candies.length; i++) {
            maxAmongAll = Math.max(maxAmongAll, candies[i]);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxAmongAll);
        }

        return result;
    }
}

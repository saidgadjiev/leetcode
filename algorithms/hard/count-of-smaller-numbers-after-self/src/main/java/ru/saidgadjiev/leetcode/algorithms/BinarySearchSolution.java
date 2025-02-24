package ru.saidgadjiev.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchSolution {

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> sorted = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; --i) {
            int val = nums[i];
            int insertPosition = findInsertPosition(sorted, val);
            result.add(insertPosition);
            sorted.add(insertPosition, val);
        }

        Collections.reverse(result);

        return result;
    }

    private int findInsertPosition(List<Integer> sorted, int val) {
        int l = 0;
        int r = sorted.size() - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (sorted.get(mid) < val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return l;
    }
}

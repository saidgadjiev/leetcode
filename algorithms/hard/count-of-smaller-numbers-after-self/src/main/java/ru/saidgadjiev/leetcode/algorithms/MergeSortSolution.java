package ru.saidgadjiev.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MergeSortSolution {

    public List<Integer> countSmaller(int[] nums) {
        Map.Entry<Integer, Integer>[] arr = new Entry[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = Map.entry(nums[i], i);
        }

        int[] count = new int[nums.length];
        mergeSort(arr, 0, nums.length - 1, count);

        return Arrays.stream(count).boxed().collect(Collectors.toList());
    }

    private void mergeSort(Map.Entry<Integer, Integer>[] arr, int left, int right, int[] counter) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid, counter);
        mergeSort(arr, mid + 1, right, counter);
        merge(arr, left, mid, right, counter);
    }

    private void merge(Map.Entry<Integer, Integer>[] arr, int left, int mid, int right, int[] counter) {
        int i = left;
        int j = mid + 1;
        int rightSmaller = 0;
        List<Map.Entry<Integer, Integer>> mergeSorted = new ArrayList<>();

        while (i <= mid && j <= right) {
            if (arr[i].getKey() <= arr[j].getKey()) {
                counter[arr[i].getValue()] += rightSmaller;
                mergeSorted.add(arr[i++]);
            } else {
                mergeSorted.add(arr[j++]);
                ++rightSmaller;
            }
        }

        while (i <= mid) {
            counter[arr[i].getValue()] += rightSmaller;
            mergeSorted.add(arr[i++]);
        }
        while (j <= right) {
            mergeSorted.add(arr[j++]);
        }

        for (int k = left; k <= right; ++k) {
            arr[k] = mergeSorted.get(k - left);
        }
    }
}

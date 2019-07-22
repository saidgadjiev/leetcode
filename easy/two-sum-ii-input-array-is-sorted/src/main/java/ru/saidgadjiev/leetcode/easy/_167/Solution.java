package ru.saidgadjiev.leetcode.easy._167;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; ++i) {
            int j = 0;
            int sum = numbers[i];

            result[j] = i + 1;
            while (j != 1) {
                int next = findNext(numbers, i + 1, target - sum);

                if (next == -1) {
                    break;
                }
                sum += numbers[next];
                result[++j] = next + 1;
            }
            if (sum == target) {
                break;
            }
        }

        return result;
    }

    private int findNext(int[] numbers, int l, int target) {
        int r = numbers.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (numbers[mid] > target) {
                r = mid - 1;
            } else if (numbers[mid] < target) {
                l = mid + 1;
            } else if (numbers[mid] == target) {
                return mid;
            }
        }

        return -1;
    }
}

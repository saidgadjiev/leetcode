package ru.saidgadjiev.leetcode.medium._74;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r = 0; int c = cols - 1;
        while (r < rows && c > -1) {
            int curr = matrix[r][c];
            if (curr == target) return true;
            if ( target > curr) ++r;
            else {
                int found = bSearch(matrix[r], target);

                return found != -1;
            }
        }

        return false;
    }

    private int bSearch(int[] arr, int target) {
        int l = 0; int r = arr.length;

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return -1;
    }
}

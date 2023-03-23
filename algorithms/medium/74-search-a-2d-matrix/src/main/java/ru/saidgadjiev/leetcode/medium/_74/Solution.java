package ru.saidgadjiev.leetcode.medium._74;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = n - 1;

        while (row < rows && col > -1) {
            int cur = matrix[row][col];
            if (cur == target) return true;
            if (target > cur) row++;
            else col--;
        }

        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int result = search(ints, target);

            if (result != -1) {
                return true;
            }
        }

        return false;
    }

    public int search(int[] nums, int target) {
        int leftBorder = 0;
        int rightBorder = nums.length - 1;

        while (leftBorder <= rightBorder){
            int mid = (leftBorder + rightBorder) / 2;
            if (nums[mid] > target) {
                rightBorder = mid - 1;
            } else if (nums[mid] < target) {
                leftBorder = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

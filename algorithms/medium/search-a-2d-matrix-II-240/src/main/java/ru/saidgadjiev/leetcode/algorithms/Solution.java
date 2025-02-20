package ru.saidgadjiev.leetcode.algorithms;

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii
 */
public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }

        int col = matrix[0].length - 1;
        int row = 0;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] > target) {
                --col;
            } else {
                ++row;
            }
        }

        return false;
    }
}

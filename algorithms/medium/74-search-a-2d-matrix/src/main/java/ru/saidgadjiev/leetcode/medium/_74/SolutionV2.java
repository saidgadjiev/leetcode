package ru.saidgadjiev.leetcode.medium._74;

public class SolutionV2 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0; int r = rows * cols;

        while (l < r) {
            int midId = l + (r - l) / 2;
            int row = midId / cols;
            int col = midId % cols;

            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] < target) {
                l = midId + 1;
            } else {
                r = midId;
            }
        }

        return false;
    }
}

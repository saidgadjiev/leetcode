package ru.saidgadjiev.leetcode.medium._54;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * Example 1:
 *
 * Input:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * Example 2:
 *
 * Input:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<>();
        }
        if (matrix.length == 1) {
            List<Integer> result = new ArrayList<>();

            for (int j = 0; j < matrix[0].length; ++j) {
                result.add(matrix[0][j]);
            }

            return result;
        }
        if (matrix[0].length == 1) {
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < matrix.length; ++i) {
                result.add(matrix[i][0]);
            }

            return result;
        }
        List<Integer> result = new ArrayList<>();

        int direction = 0;
        int i = 0, j = 0;
        int borderRight = matrix[0].length - 1;
        int borderLeft = 0;
        int borderBottom = matrix.length - 1;
        int borderTop = 0;

        for (int p = 1; p <= matrix.length * matrix[0].length;) {
            switch (direction) {
                case 0: //right
                    if (j == borderRight) {
                        direction = 1;
                        ++borderTop;
                    } else {
                        result.add(matrix[i][j++]);
                        ++p;
                        break;
                    }
                case 1: //down
                    if (i == borderBottom) {
                        direction = 2;
                        --borderRight;
                    } else {
                        result.add(matrix[i++][j]);
                        ++p;
                        break;
                    }
                case 2: //left
                    if (j == borderLeft) {
                        direction = 3;
                        --borderBottom;
                    } else {
                        result.add(matrix[i][j--]);
                        ++p;
                        break;
                    }
                case 3: //top
                    if (i == borderTop) {
                        direction = 0;
                        ++borderLeft;
                    } else {
                        result.add(matrix[i--][j]);
                        ++p;
                        break;
                    }
            }
        }

        return result;
    }
}

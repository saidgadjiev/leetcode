package ru.saidgadjiev.leetcode.easy._54;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 *
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int iTop = 0;
        int iBottom = matrix.length - 1;
        int jRight = matrix[0].length - 1;
        int jLeft = 0;
        int total = matrix.length * matrix[0].length;

        while (result.size() < total) {
            for (int j = jLeft; j <= jRight && result.size() < total; j++) {
                result.add(matrix[iTop][j]);
            }
            ++iTop;
            for (int i = iTop; i <= iBottom && result.size() < total; i++) {
                result.add(matrix[i][jRight]);
            }
            --jRight;
            for (int j = jRight; j >= jLeft && result.size() < total; j--) {
                result.add(matrix[iBottom][j]);
            }
            --iBottom;
            for (int i = iBottom; i >= iTop && result.size() < total; i--) {
                result.add(matrix[i][jLeft]);
            }
            ++jLeft;
        }

        return result;
    }
}

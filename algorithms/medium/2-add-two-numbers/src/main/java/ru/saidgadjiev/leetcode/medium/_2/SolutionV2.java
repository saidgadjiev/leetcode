package ru.saidgadjiev.leetcode.medium._2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionV2 {

    public int[] addTwoNumbers(int[] num1, int[] num2) {
        List<Integer> result = new ArrayList<>();

        int i1 = num1.length - 1;
        int i2 = num2.length - 1;
        int carry = 0;
        while (i1 >= 0 || i2 >= 0 || carry != 0) {
            int x = i1 < 0 ? 0 : num1[i1];
            int y = i2 < 0 ? 0 : num2[i2];
            int sum = x + y + carry;
            carry = sum / 10;
            result.add(sum % 10);
            --i1;
            --i2;
        }
        Collections.reverse(result);

        return result.stream().mapToInt(i -> i).toArray();
    }
}

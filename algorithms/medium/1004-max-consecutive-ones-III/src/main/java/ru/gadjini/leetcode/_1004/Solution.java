package ru.gadjini.leetcode._1004;

/**
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 *
 * Максимум изначально равно 0
 * Получается начинаем с первого элемента и идем заменяя нули пока k не будет равно 0 и элемент = 0
 * Когда стало 0 выбираем макс из новой длины и сдвигаем левый индекс до крайнего 0 увеличиваем k и дальше
 * повторояем предыдущий шаг и снова то же самое
 */
public class Solution {

    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                --k;
            }
            if (k < 0) {
                k += 1 - nums[left];
                ++left;
            }
        }

        return right - left;
    }
}

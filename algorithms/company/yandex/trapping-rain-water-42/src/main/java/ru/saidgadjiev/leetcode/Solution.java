package ru.saidgadjiev.leetcode;

/**
 * Мерим объем воды вниз соответственно если мы знаем что справа есть большее то считаем слева направо
 * по формуле макс левый минус текущий бар.
 * Если знаем что слева есть больший, то считаем справа налево вычитывая из большего бара меньшие.
 * Делаем так, пока не обойдем весь массив баров.
 * Если текущий бар и является максимальным, то будет вычитывание из самого себя,
 * то есть результат 0 соответственно мы ничего не нарушаем.
 */
public class Solution {

    public int trap(int[] height) {
        int result = 0, leftMax = height[0], rightMax = height[height.length - 1], left = 0, right = height.length - 1;

        while (left < right) {
            if (leftMax < rightMax) {
                ++left;
                leftMax = Math.max(leftMax, height[left]);
                result += leftMax - height[left];
            } else {
                --right;
                rightMax = Math.max(rightMax, height[right]);
                result += rightMax - height[right];
            }
        }

        return result;
    }
}

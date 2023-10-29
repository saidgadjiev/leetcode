package ru.gadjini.leetcode._334;

/**
 * https://leetcode.com/problems/increasing-triplet-subsequence/
 *
 * Идем по массиву и смотрим если у нас очередной элемент меньше чем текущий элемент массива то обновляем
 * firstNum
 * Если больше чем firstNum но меньше чем secondNum то обновляем secondNum
 * Если больше чем и firstNum и secondNum то мы нашли ответ
 *
 * Если мы заапдейтили firstNum после того как secondNum уже найден и так же мы нашли элемент больший чем seconNum
 * то ответ все равно True потому что если у нас был найден secondNum то был найден и firstNum меньший чем secondNum
 * поэтому ответ есть. Для примера несмотря на то что firstNum перед ответом будет 0 а не 1 а secondNum будет 2:
 * nums = [1,2,0,3] # should return True
 *
 * first_num = 1
 * second_num = 2
 * first_num = 0
 * return True
 */
public class Solution {

    public boolean increasingTriplet(int[] nums) {
        int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstNum) {
                firstNum = num;
            } else if (num <= secondNum) {
                secondNum = num;
            } else {
                return true;
            }
        }

        return false;
    }
}

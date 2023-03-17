package ru.saidgadjiev.leetcode.easy._43;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/multiply-strings/
 *
 *             1 2 3
 *             4 5 6
 *             _____
 *             7 3 8| 1
 *           6 1 5  | 1
 *         4 9 2    |
 *         _________
 *         5 6 0 8 8
 *
 *
 *             1 2 3
 *             4 5 6
 *             _____
 *
 *             Итерируемся по строке num2 и начинаем с конца
 *             1. 6 * 3 = 18 если есть остаток добавляем
 *             2. Записываем остаток с шага 1 в строку и сохраняем в остаток
 *             3. Проделываем тоже самое со всеми числами
 *             4. Получаем строку и сохраняем его в лист
 *             5. Проделываем тоже самое с каждой цифрой и в итоге в List будут все строки которые надо сложить
 *             6. Количество сдвига равно num2.length - 1
 *             7. дописываем количество нулей с шага 6 в начала и num2.length - 1  с шага 6 в конец
 *
 *
 *             7 3 8| 1
 *           6 1 5  | 1 дописываем в конец 1 0 и первой строке вначало 1 0
 *         4 9 2    | дописываем в конец 00 вначало предыдущего 0
 *
 * цикл от 1 до размера list
 * локальную переменную сам
 * и цикл
 *         1. 8 + 0 + 0 = 8 3 + 5 + 0 7 + 1 + 2
 *         2. складываем к последней цифре
 *
 *
 *         999
 *         999
 *         __
 *        8991
 *       8991
 *      8991
 *       ___
 *       98001
 *
 */
//TODO: optimize
public class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        List<String> multiplyResults = new ArrayList<>();
        int endZeroCount = 0;
        for (int i = num2.length() - 1; i >= 0; i--) {
            int carry = 0;
            StringBuilder multiplyResult = new StringBuilder();
            for (int j = num1.length() - 1; j >= 0; j--) {
                int numMultiplyResult = (num2.charAt(i) - '0') * (num1.charAt(j) - '0') + carry;
                multiplyResult.insert(0, numMultiplyResult % 10 );
                carry = numMultiplyResult / 10;
            }
            multiplyResult.append("0".repeat(endZeroCount));
            if (carry > 0) {
                multiplyResult.insert(0, carry);
            }
            ++endZeroCount;
            multiplyResults.add(multiplyResult.toString());
        }

        int carry = 0;
        StringBuilder result = new StringBuilder();
        int maxLength = multiplyResults.get(multiplyResults.size() - 1).length();
        for (int i = 0; i < maxLength; ++i) {
            int sum = carry;
            for (String multiplyResult : multiplyResults) {
                if (multiplyResult.length() - 1 - i >= 0) {
                    sum += multiplyResult.charAt(multiplyResult.length() - 1 - i) - '0';
                }
            }
            result.insert(0, sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }
}

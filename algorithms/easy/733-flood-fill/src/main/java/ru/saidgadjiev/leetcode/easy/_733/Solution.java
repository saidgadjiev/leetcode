package ru.saidgadjiev.leetcode.easy._733;

import java.util.*;

/**
 * https://leetcode.com/problems/flood-fill
 * 1 1 1           2 2 2
 * 1 1 0    -->    2 2 0
 * 1 0 1           2 0 1
 *
 * 1 2 1
 * 2 2 0   --> [[0,1][1,0]]
 * 1 0 1
 *
 * [0,1]
 * 2 2 2
 * 2 2 0   --> [[1,0][0,0][0,2]]
 * 1 0 1
 *
 * [1,0]
 * 2 2 2
 * 2 2 0   --> [[0,0][0,2][2,0]]
 * 2 0 1
 *
 * [[0,0][0,2][2,0]] - [] no changes
 * return result
 *
 * Что мы имеем:
 * - 2-х мерный массив
 * - пометить цветом все достижимые по 4-м направлениям клетки
 *
 * Как можно определить достижимые клетки?
 * Сравниваем 4 клетки близлежащие и где такой же цвет как у нас помечаем новым цветом
 * Дальше проходим по этим 4-м клеткам новым и проделываем то же самое с ними
 * определяем 4 клетки к каждому из этих 4-х и снова помечаем
 * в какой-то момент у нас не будет новых клеток которые мы можем пометить и это будет остановкой алгоритма
 */
public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int colorToReplace = image[sr][sc];
        if (color == colorToReplace) {
            return image;
        }

        image[sr][sc] = color;
        List<Integer[]> marked = floodFill4(image, sr, sc, color, colorToReplace);
        Queue<Integer[]> highsToMarkQueue = new LinkedList<>(marked);

        while (!highsToMarkQueue.isEmpty()) {
            Integer[] srScToMark = highsToMarkQueue.poll();
            marked = floodFill4(image, srScToMark[0], srScToMark[1], color, colorToReplace);
            highsToMarkQueue.addAll(marked);
        }

        return image;
    }

    public List<Integer[]> floodFill4(int[][] image, int sr, int sc, int color, int colorToReplace) {
        List<Integer[]> marked = new ArrayList<>();
        if (sr > 0 && image[sr - 1][sc] == colorToReplace) {
            image[sr - 1][sc] = color;
            marked.add(new Integer[] {sr - 1, sc});
        }
        if (sr < image.length - 1 && image[sr + 1][sc] == colorToReplace) {
            image[sr + 1][sc] = color;
            marked.add(new Integer[] {sr + 1, sc});
        }
        if (sc > 0 && image[sr][sc - 1] == colorToReplace) {
            image[sr][sc - 1] = color;
            marked.add(new Integer[] {sr, sc - 1});
        }
        if (sc < image[0].length -1 && image[sr][sc + 1] == colorToReplace) {
            image[sr][sc + 1] = color;
            marked.add(new Integer[] {sr, sc + 1});
        }

        return marked;
    }

    public static void main(String[] args) {
        int[][] floodFill = new Solution().floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, 0, 0, 0);
        System.out.println(Arrays.deepToString(floodFill));
    }
}

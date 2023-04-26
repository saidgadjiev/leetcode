package ru.saidgadjiev.leetcode.medium._210;

import java.util.*;

/**
 * https://leetcode.com/problems/course-schedule-ii/
 * 4 course
 * {1, 0},
 * {2, 0},
 * {3, 1},
 * {3, 2}
 * <p>
 * {1,0} -> {1, {0}} {0, {}}
 * {2,0} -> {2, {0}} {1, {0}} {0, {}}
 * {3,1} -> {3, {1}} {2, {0}} {1, {0}} {0, {}}
 * {3,2} -> {3, {1, 2}} {2, {0}} {1, {0}} {0, {}}
 * <p>
 * 1. Надо теперь совершить обход сначала берем курс 0 и берем из мапы список курсов которые надо обойти
 * 2. Если курсов нет то переходим к следующему курсу
 * 3. Если есть курсы которые надо обойти берем первый из них и проделываем шаг 1-2 и так пока не обойдем все курсы
 * <p>
 * {0,1} {0, {1}} {1, {}}
 * {1,0} {0, {1}} {1, {0}}
 */
public class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> prerequisitesMap = new LinkedHashMap<>();
        for (int[] prerequisite : prerequisites) {
            prerequisitesMap.putIfAbsent(prerequisite[0], new ArrayList<>());
            prerequisitesMap.get(prerequisite[0]).add(prerequisite[1]);
            prerequisitesMap.putIfAbsent(prerequisite[1], new ArrayList<>());
        }
        List<Integer> result = new ArrayList<>();
        int nextCourse = 0;
        while (true) {
            try {
                finishCourse(nextCourse++, numCourses, prerequisitesMap, result, new HashSet<>());
            } catch (IllegalStateException e) {
                return new int[]{};
            }
            if (nextCourse >= numCourses) {
                return result.stream().mapToInt(Integer::intValue).toArray();
            }
        }
    }

    private void finishCourse(int currCourse, int numCourses,
                              Map<Integer, List<Integer>> prerequisitesMap,
                              List<Integer> result, Set<Integer> inProgressCourse) {
        //Если мы уже прошли все курсы или мы уже закончили текущий курс до этого
        if (currCourse >= numCourses || result.contains(currCourse)) {
            return;
        }
        //Если курс ожидает завершение самого себя
        if (!inProgressCourse.add(currCourse)) {
            throw new IllegalStateException("Infinite recursion");
        }
        for (Integer prerequisiteCourse : prerequisitesMap.getOrDefault(currCourse, new ArrayList<>())) {
            finishCourse(prerequisiteCourse, numCourses, prerequisitesMap, result, inProgressCourse);
        }
        result.add(currCourse);
        inProgressCourse.remove(currCourse);
    }
}

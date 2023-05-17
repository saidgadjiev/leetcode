package ru.saidgadjiev.leetcode.medium._721;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.saidgadjiev.leetcode.common.ListUtil;

import java.util.List;

class SolutionTest {


    @Test
    public void case1() {
        Solution solution = new Solution();
        List<List<String>> lists = solution.accountsMerge(ListUtil.parseStringList("[[\"John\",\"johnsmith@mail.com\",\"john_newyork@mail.com\"],[\"John\",\"johnsmith@mail.com\",\"john00@mail.com\"],[\"Mary\",\"mary@mail.com\"],[\"John\",\"johnnybravo@mail.com\"]]"));

        Assertions.assertEquals(ListUtil.parseStringList("[[\"John\",\"john00@mail.com\",\"john_newyork@mail.com\",\"johnsmith@mail.com\"],[\"Mary\",\"mary@mail.com\"],[\"John\",\"johnnybravo@mail.com\"]]"),
                lists);
    }

    @Test
    public void case2() {
        Solution solution = new Solution();
        List<List<String>> lists = solution.accountsMerge(ListUtil.parseStringList("[[\"Alex\",\"Alex5@m.co\",\"Alex4@m.co\",\"Alex0@m.co\"],[\"Ethan\",\"Ethan3@m.co\",\"Ethan3@m.co\",\"Ethan0@m.co\"],[\"Kevin\",\"Kevin4@m.co\",\"Kevin2@m.co\",\"Kevin2@m.co\"],[\"Gabe\",\"Gabe0@m.co\",\"Gabe3@m.co\",\"Gabe2@m.co\"],[\"Gabe\",\"Gabe3@m.co\",\"Gabe4@m.co\",\"Gabe2@m.co\"]]"));

        Assertions.assertEquals(ListUtil.parseStringList("[[\"Alex\",\"Alex0@m.co\",\"Alex4@m.co\",\"Alex5@m.co\"],[\"Ethan\",\"Ethan0@m.co\",\"Ethan3@m.co\"],[\"Kevin\",\"Kevin2@m.co\",\"Kevin4@m.co\"],[\"Gabe\",\"Gabe0@m.co\",\"Gabe2@m.co\",\"Gabe3@m.co\",\"Gabe4@m.co\"]]"), lists);
    }

    @Test
    public void case3() {
        Solution solution = new Solution();
        List<List<String>> lists = solution.accountsMerge(ListUtil.parseStringList("[[\"David\",\"Avid0@m.co\",\"David0@m.co\",\"David1@m.co\"],[\"David\",\"Gvid3@m.co\",\"David3@m.co\",\"David4@m.co\"],[\"David\",\"David4@m.co\",\"David5@m.co\"],[\"David\",\"David2@m.co\",\"David3@m.co\"],[\"David\",\"David1@m.co\",\"David2@m.co\"]]"));
        Assertions.assertEquals(ListUtil.parseStringList("[[\"David\",\"Avid0@m.co\",\"David0@m.co\",\"David1@m.co\",\"David2@m.co\",\"David3@m.co\",\"David4@m.co\",\"David5@m.co\",\"Gvid3@m.co\"]]"), lists);
    }
}
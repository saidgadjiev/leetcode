package ru.saidgadjiev.leetcode.medium._721;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],["John","johnsmith@mail.com","john00@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
 * Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
 */
public class Solution {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[accounts.size()];

        for (int i = 0; i < accounts.size(); i++) {
            if (!visited[i]) {
                List<String> mergeAccounts = new ArrayList<>();
                mergeAccounts(mergeAccounts, accounts.get(i));
                result.add(mergeAccounts);
                dfs(visited, i, accounts.get(i), mergeAccounts, accounts);
                Collections.sort(mergeAccounts);
                mergeAccounts.add(0, accounts.get(i).get(0));
            }
        }

        return result;
    }

    private void dfs(boolean[] visited, int currentAccountIndex,
                     List<String> currentAccount, List<String> mergedAccounts,
                     List<List<String>> candidateAccounts) {
        visited[currentAccountIndex] = true;

        for (int i = 0; i < candidateAccounts.size(); i++) {
            if (!visited[i]) {
                int finalI = i;
                if (currentAccount.stream().skip(1).anyMatch(s -> candidateAccounts.get(finalI).contains(s))) {
                    mergeAccounts(mergedAccounts, candidateAccounts.get(i));
                    dfs(visited, i, candidateAccounts.get(i), mergedAccounts, candidateAccounts);
                }
            }
        }
    }

    private void mergeAccounts(List<String> result, List<String> accounts) {
        List<String> emailAccounts = accounts.stream().skip(1).collect(Collectors.toList());
        for (String s : emailAccounts) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
    }
}

package ru.saidgadjiev.leetcode.medium._721;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Input: accounts = [["John","johnsmith@mail.com","john_newyork@mail.com"],["John","johnsmith@mail.com","john00@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
 * Output: [["John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"],["Mary","mary@mail.com"],["John","johnnybravo@mail.com"]]
 */
@SuppressWarnings("PMD")
public class Solution {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[accounts.size()];

        int size = accounts.size();
        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                Set<String> mergeAccounts = new TreeSet<>();
                mergeAccounts(mergeAccounts, accounts.get(i));
                dfs(visited, i, accounts.get(i), mergeAccounts, accounts);
                List<String> mergedResult = new ArrayList<>(mergeAccounts);
                mergedResult.add(0, accounts.get(i).get(0));
                result.add(mergedResult);
            }
        }

        return result;
    }

    private void dfs(boolean[] visited, int currentAccountIndex,
                     List<String> currentAccount, Set<String> mergedAccounts,
                     List<List<String>> candidateAccounts) {
        visited[currentAccountIndex] = true;

        int size = candidateAccounts.size();
        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                if (isConnected(currentAccount, candidateAccounts.get(i))) {
                    mergeAccounts(mergedAccounts, candidateAccounts.get(i));
                    dfs(visited, i, candidateAccounts.get(i), mergedAccounts, candidateAccounts);
                }
            }
        }
    }

    private boolean isConnected(List<String> current, List<String> candidate) {
        int size = current.size();
        for (int i = 0; i < size; i++) {
            if (i > 0 && candidate.contains(current.get(i))) {
                return true;
            }
        }

        return current.get(1).equals(candidate.get(1));
    }

    private void mergeAccounts(Set<String> result, List<String> accounts) {
        int size = accounts.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                result.add(accounts.get(i));
            }
        }
    }
}

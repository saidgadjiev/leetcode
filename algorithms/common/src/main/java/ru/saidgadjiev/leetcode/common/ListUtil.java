package ru.saidgadjiev.leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtil {

    private ListUtil() {

    }

    public static ListNode parseListNode(String str) {
        str = str.substring(1, str.length() - 1);
        String[] nodes = str.split(",");
        ListNode root = null;
        ListNode head = null;

        for (String node : nodes) {
            if (root == null) {
                root = new ListNode(Integer.parseInt(node));
                head = root;
            } else {
                head.next = new ListNode(Integer.parseInt(node));
                head = head.next;
            }
        }

        return root;
    }

    public static List<List<String>> parseStringList(String str) {
        List<List<String>> result = new ArrayList<>();

        str = str.substring(1, str.length() - 1);

        String[] lists = str.split("\"]");

        for (String list : lists) {
            String[] split = list.split(",");
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].replace("[", "").replace("\"", "");
            }
            List<String> vals = Arrays.stream(split).filter(f -> !f.isEmpty()).collect(Collectors.toList());
            result.add(vals);
        }

        return result;
    }
}

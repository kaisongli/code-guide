package com.leetcode.string.longcommonpre;

import java.util.Arrays;

/**
 * Leetcode: 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。如果不存在公共前缀，返回空字符串 “”。
 */

/**
 * 解法：
 * 1、对字符串数组进行排序
 * 2、比较第一个字符串和最后一个字符串的公共前缀
 */
public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        StringBuilder res = new StringBuilder();
        int len = first.length < last.length ? first.length : last.length;
        for (int i = 0; i < len; i++) {
            if (first[i] == last[i]) {
                res.append(first[i]);
            } else {
                break;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}

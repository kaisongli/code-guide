package com.leetcode.easy._125;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * <p>
 * 解法：
 * 双指针法
 * 分别判断首尾指针指向的字符是不是字母和数字字符，如果不是的话，例如是空格，标点符号之类的，那分别指向下一个
 * 如果当前指向的字符是符合要求的，那需要判断是否相等，如果不相等就直接返回false
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            while (begin < end && !Character.isLetterOrDigit(s.charAt(begin))) {
                begin++;
            }
            while (begin < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(begin)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }
}

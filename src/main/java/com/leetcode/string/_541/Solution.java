package com.leetcode.string._541;

/**
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个2k个字符的前k个字符进行反转。
 * 如果剩余少于 k 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。

 示例:

 输入: s = "abcdefg", k = 2
 输出: "bacdfeg"
 */
public class Solution {
    public String reverseStr(String s, int k) {
        int len = s.length();
        char[] chs = s.toCharArray();
        for(int i = 0; i < len;){
            if(len - i >= 2*k){
                reverseStr(chs, i, i+k-1);
                i += 2*k;
            }else if(len - i >= k){
                reverseStr(chs, i, i+k-1);
                break;
            }else if(len - i < k){
                reverseStr(chs, i, len-1);
                break;
            }
        }
        return String.valueOf(chs);
    }

    private String reverseStr(char[] chars, int left, int right){
        while (left < right){
            swap(chars, left, right);
            left ++;
            right --;
        }
        return String.valueOf(chars);
    }

    private void swap(char[] chars, int left, int right) {
        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;
    }
}

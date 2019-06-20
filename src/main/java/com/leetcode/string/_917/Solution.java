package com.leetcode.string._917;

/**
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * <p>
 * 示例 1：
 * <p>
 * 输入："ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 * <p>
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 */
public class Solution {
    public String reverseOnlyLetters(String S) {
        if (S.length() <= 1 || S == null) {
            return S;
        }
        int left = 0;
        int right = S.length() - 1;
        char[] chars = S.toCharArray();
        while (left < right){
            if (! Character.isLetter(chars[left])){
                left ++;
            }else if (! Character.isLetter(chars[right])){
                right --;
            }else if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])){
                swap(chars, left, right);
                left ++;
                right --;
            }
        }
        return String.valueOf(chars);
    }

    private void swap(char[] chars, int left, int right) {
        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;
    }
}

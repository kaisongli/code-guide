package com.leetcode.string._345;


/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

 示例 1:

 输入: "hello"
 输出: "holle"
 示例 2:

 输入: "leetcode"
 输出: "leotcede"
 */
public class Solution {
    public String reverseVowels(String s) {
        if("".equals(s) || s.trim().length() <= 1) {
            return s;
        }
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            if (!isVowels(chars[left])) {
                left ++;
            } else if (!isVowels(chars[right])) {
                right --;
            } else if (isVowels(chars[left]) && isVowels(chars[right])) {
                swap(chars, left, right);
                left ++;
                right --;
            }
        }
        return String.valueOf(chars);
    }

    private static void swap(char[] chars, int left, int right){
        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;
    }

    private static boolean isVowels(char ch) {
        if (ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U'
                ) {
            return true;
        }
        return false;
    }
}

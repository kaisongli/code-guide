package com.leetcode.string._344;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。

 示例 1:

 输入: "hello"
 输出: "olleh"
 示例 2:

 输入: "A man, a plan, a canal: Panama"
 输出: "amanaP :lanac a ,nalp a ,nam A"
 */
public class Solution {
    public static String reverseString(String str) {
        if (str == null || str.length() == 0){
            return str;
        }
        int left = 0;
        int right = str.length() - 1;
        char[] chars = str.toCharArray();
        char tmp;
        while (left < right){
            tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left ++;
            right --;
        }
        return new String(chars);
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(Solution.reverseString(s));
    }

}

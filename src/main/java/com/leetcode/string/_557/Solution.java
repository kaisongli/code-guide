package com.leetcode.string._557;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

 示例 1:

 输入: "Let's take LeetCode contest"
 输出: "s'teL ekat edoCteeL tsetnoc"
 */
public class Solution {
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0){
            return s;
        }
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i ++){
            StringBuilder sb = new StringBuilder(words[i]);
            if (res.length() > 0){
                res.append(" ");
            }
            res.append(sb.reverse().toString());
        }
        return res.toString();
    }

    public String reverseWords2(String s) {
        if (s == null || "".equals(s)){
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder reverseString = new StringBuilder();
        for (int i = 0; i < words.length; i ++){
            String str = words[i];
            int left = 0;
            int right = str.length() - 1;
            char[] chars = str.toCharArray();
            while (left < right){
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left ++;
                right --;
            }
            if (reverseString.length() > 0){
                reverseString.append(" ");
            }
            reverseString.append(chars);
        }
        return reverseString.toString();
    }
    /**
     * url反转：将www.baidu.com转化成www.udiab.moc
     */
    public String reverseUrl(String url){
        if ("".equals(url) || url.length() <= 1){
            return url;
        }
        String[] words = url.split("\\.");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i ++){
            StringBuilder sb = new StringBuilder(words[i]);
            if (res.length() > 1){
                res.append(".");
            }
            res.append(sb.reverse());
        }
        return res.toString();
    }

    public static void main(String[] args){
        String str = "Let's take LeetCode contest";
        System.out.println(Solution.reverseWords(str));
        System.out.println(new Solution().reverseUrl("www.baidu.com"));
    }
}

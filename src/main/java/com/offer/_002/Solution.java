package com.offer._002;

/**
 * 题目描述
 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        if (str != null && str.length() > 0){
            int oldLen = str.length();
            int oldIndex = oldLen - 1;
            int spaceNum = 0;
            for (int i = 0; i < oldLen; i++){
                if(str.charAt(i) == ' '){
                    spaceNum ++;
                }
            }
            int newLen = oldLen + spaceNum * 2;
            int newIndex = newLen - 1;
            str.setLength(newLen);
            for (int i = oldIndex; i >= 0 ; i--){
                if(str.charAt(i) == ' '){
                    str.setCharAt(newIndex --, '0');
                    str.setCharAt(newIndex --, '2');
                    str.setCharAt(newIndex --, '%');
                }else {
                    str.setCharAt(newIndex --, str.charAt(i));
                }
            }
        }
        return str.toString();
    }
}
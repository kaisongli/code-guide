package com.leetcode.string.firstnorepeatedchar;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by likaisong on 2019/4/16.
 */
public class Solution {
    public static char getFirstNoRepeatChar(String str){
        if (str == null || "".equals(str)){
            return ' ';
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        StringBuilder charSort = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else {
                map.put(str.charAt(i), 1);
            }
            charSort.append(str.charAt(i));
        }
        for (int i = 0; i < charSort.length(); i ++){
            if (map.get(charSort.charAt(i)) == 1){
                return charSort.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args){
        System.out.println(getFirstNoRepeatChar("google"));
    }
}

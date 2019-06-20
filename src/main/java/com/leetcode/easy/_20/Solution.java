package com.leetcode.easy._20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 */
/**
 * 解法
 *
 * 如果遇到右半边括号时，分类讨论：
 *
 * 1）如果栈为空，就直接返回false
 *
 * 2）若不为对应的左半边括号，反之返回false
 *
 * 2）如栈不为空且为对应的左半边括号，则取出栈顶元素，继续循环
 *
 * 如果当前字符为左半边括号时，则将其压入栈中即可
 *
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>(3);
        initMap(map);
        for (int i = 0; i < s.length(); i++) {
            //右括号
            if (map.containsKey(s.charAt(i))) {
                if (stack.isEmpty()){
                    return false;
                } else if (!stack.pop().equals(map.get(s.charAt(i)))) {
                    return false;
                }

            } else {
                stack.push(s.charAt(i));
            }

        }
        return stack.isEmpty();
    }

    private void initMap(Map<Character, Character> map) {
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }
}

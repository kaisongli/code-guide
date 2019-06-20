package com.offer._003;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述
 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        if (listNode != null){
            Stack<Integer> stack = new Stack<Integer>();
            while (listNode != null){
                stack.push(listNode.val);
                listNode = listNode.next;
            }
            while (!stack.empty()){
                resList.add(stack.pop());
            }
        }
        return resList;
    }
}

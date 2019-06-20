package com.leetcode.node._002;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

/**
 * 从尾到头，首先想到的是利用栈来实现；
 * 另外一种方法是利用三个指针把链表反转，关键是next指针保存断开的节点。
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 利用栈来实现
     *
     * @param head
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode head) {
        ArrayList<Integer> res = new ArrayList<Integer>(16);
        if (head == null) {
            return res;
        }
        //利用栈
        Stack<Integer> stack = new Stack<Integer>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

    /**
     * 利用三个指针把链表反转
     *
     * @param head
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode head) {
        ArrayList<Integer> res = new ArrayList<Integer>(16);
        if (head == null) {
            return res;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        while (pre != null) {
            res.add(pre.val);
            pre = pre.next;
        }
        return res;
    }


    /**
     * 输入一个链表，反转链表后，输出新链表的表头。
     */
    /**
     * 解题思路
     * 设置三个指针，cur为当前节点，pre为当前节点的前一个节点，next为当前节点的下一个节点，
     * 需要pre和next的目的是让当前节点从pre->cur->next1->next2变成pre<-cur next1->next2的过程中，
     * 用pre让节点反转所指方向，next节点保存next1节点防止链表断开
     *
     * @param head
     * @return
     */
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while (cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

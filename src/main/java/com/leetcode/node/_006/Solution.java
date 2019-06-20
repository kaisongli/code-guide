package com.leetcode.node._006;

/**
 * 题目描述：求单链表的中间节点，如果链表的长度为偶数，返回中间两个节点的任意一个，若为奇数，则返回中间节点。
 */
/**
 * 解题思路：快慢指针，慢的走一步，快的走两步，当快指针到达尾节点时，慢指针移动到中间节点。
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    // 遍历一次，找出单链表的中间节点
    public ListNode findMiddleNode(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pFast = head;
        ListNode pSlow = head;
        while (pFast != null && pFast.next != null){
            pFast = pFast.next.next;
            pSlow = pSlow.next;
        }
        return pSlow;
    }

}

package com.leetcode.node._004;

/**
 * 给定一个单链表，设计一个算法实现链表向右旋转 K 个位置。
 */

/**
 * 解题思路：
 * 先遍历整个链表获得链表长度n，然后此时把链表头和尾链接起来，在往后走n – k % n个节点就到达新链表的头结点前一个点，这时断开链表即可。
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
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int n = 1;
        ListNode cur = head;
        while (cur.next != null) {
            ++n;
            cur = cur.next;
        }
        cur.next = head;
        int m = n - k % n;
        for (int i = 0; i < m; ++i) {
            cur = cur.next;
        }
        ListNode newhead = cur.next;
        cur.next = null;
        return newhead;
    }

}

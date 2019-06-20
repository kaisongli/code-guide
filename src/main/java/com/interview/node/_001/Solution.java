package com.interview.node._001;

/**
 * 给定两个有序链表的头指针head1和head2，打印两个链表的公共部分
 */

/**
 * 解法：
 * 如果head1的值比head2的值小，head1往下移动
 * 如果head2的值比head1的值小，head2往下移动
 * 如果相等就打印
 * head1和head2其中任意一个为null就终止遍历
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public void printCommonpart(ListNode head1, ListNode head2) {
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                head1 = head1.next;
            } else if (head2.val < head1.val) {
                head2 = head2.next;
            } else {
                System.out.println(head1.val + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }
}

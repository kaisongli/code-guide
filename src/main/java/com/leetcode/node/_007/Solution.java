package com.leetcode.node._007;

/**
 * 给定一个单链表和数值x，划分链表使得所有小于x的节点排在大于等于x的节点之前。
 */

/**
 * 解题思路：可以建立两个节点，一个后面跟进值小于x的节点，
 * 另一个后面跟进大于x的。然后整个原始链表遍历完之后，
 * 再将现在新建的两个链表合并，划分就完成了。
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode left = leftDummy, right = rightDummy;
        ListNode cur = head;
        while (cur != null){
            if (cur.val < x){
                left.next = cur;
                left = cur;
            }else {
                right.next = cur;
                right = cur;
            }
            cur = cur.next;
        }
        left.next = rightDummy.next;
        right.next = null;
        return leftDummy.next;
    }

}

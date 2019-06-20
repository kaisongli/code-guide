package com.leetcode.node._017;

/**
 * 找到两个无环单链表第一个相交点，如果不相交返回空，要求在线性时间复杂度和常量空间复杂度内完成。
 */

/***
 * 两个指针p1和p2分别指向链表A和链表B，
 * 它们同时向前走，当走到尾节点时，转向另一个链表，
 * 比如p1走到链表 A 的尾节点时，下一步就走到链表B，
 * p2走到链表 B 的尾节点时，下一步就走到链表 A，
 * 当p1==p2 时，就是链表的相交点
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        if (headA == headB) {
            return headA;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;
        while (p1 != p2) {
            // 遍历完所在链表后从另外一个链表再开始
            // 当 p1 和 p2 都换到另一个链表时，它们对齐了：
            // （1）如果链表相交，p1 == p2 时为第一个相交点
            // （2）如果链表不相交，p1 和 p2 同时移动到末尾，p1 = p2 = null，然后退出循环
            p1 = (null == p1) ? headB : p1.next;
            p2 = (null == p2) ? headA : p2.next;
        }
        return p1;
    }
}

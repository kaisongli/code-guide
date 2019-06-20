package com.leetcode.node._012;

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */

/**
 * 解题思路
 * 首先添加一个头节点，以避免碰到第一个，第二个节点就相同的情况
 * 设置 first ，second 指针， first 指针指向当前确定不重复的那个节点，
 * 而second指针相当于工作指针，一直往后面搜索。
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode pre = new ListNode(0);
        pre.next = pHead;
        ListNode first = pre;
        ListNode second = first.next;
        while (second != null){
            if (second.next != null && second.val == second.next.val){
                while (second.next != null && second.val == second.next.val){
                    second = second.next;
                }
                //当前不重复的节点
                first.next = second.next;
            }else {
                first = first.next;
            }
            second = second.next;
        }
        return pre.next;
    }
}

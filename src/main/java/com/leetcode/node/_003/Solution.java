package com.leetcode.node._003;

/**
 * 给定一个单向链表的头结点head,以及两个整数from和to,在单链表上把第from个节点和第to个节点这一部分进行反转
 */

/**
 * 解答:

 1. 先判断是否满足1<=from<=to<=N, 如果不满足, 则直接返回原来的头节点

 2. 找到第from-1个节点reversePreNode和第to+1个节点reverseNextNode。reversePreNode即是要反转部分的前一个节点，reverseNextNode是反转部分的后一个节点。

    把反转部分先反转，然后正确地连接reversePreNode和reverseNextNode

 3. 如果reversePreNode为null，说明反转部分是包含头结点的，则返回新的头结点，也就是没反转之前反转部分的最后一个节点，

   也是反转之后反转部分的第一个节点; 如果reversePreNode不为null，则返回旧的头结点.
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int from, int to) {
        if (head == null || head.next == null || from > to || from < 1){
            return head;
        }
        int i = 1;
        // 反转部分链表反转后的头结点
        ListNode reversedNewHead = null;
        // 反转部分链表反转后的尾结点
        ListNode reversedTail = null;
        // 原链表的头结点
        ListNode oldHead = head;
        //当前节点
        ListNode cur = head;
        // 反转部分链表反转前其头结点的前一个结点
        ListNode reversePreNode = null;
        ListNode reverseNextNode = null;
        while (cur != null) {
            if (i > to) {
                break;
            }
            if (i == from - 1) {
                reversePreNode = cur;
            }
            if (i >= from && i <= to) {
                if (i == from) {
                    reversedTail = cur;
                }
                reverseNextNode = cur.next;
                cur.next = reversedNewHead;
                reversedNewHead = cur;
                cur = reverseNextNode;
            } else {
                cur = cur.next;
            }
            i++;
        }
        reversedTail.next = reverseNextNode;
        //如果reversePreNode为null，说明反转部分是包含头结点的，则返回新的头结点，也就是没反转之前反转部分的最后一个节点，
        // 也是反转之后反转部分的第一个节点; 如果reversePreNode不为null，则返回旧的头结点.
        if (reversePreNode != null) {
            reversePreNode.next = reversedNewHead;
            return oldHead;
        } else {
            return reversedNewHead;
        }
    }
}

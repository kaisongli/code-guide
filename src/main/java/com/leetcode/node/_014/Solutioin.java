package com.leetcode.node._014;

/**
 * 判断单链表是否有环，如果有，找到环的入口点
 */

/**
 * 解题思路：快慢指针
 * 定义两个指针指向头节点，快的一次走两步，慢的一次走一步，
 * 如果有环，那么必然在环内相遇，跳出循环，
 * 将其中一个指针指向头节点，另一个结点在环内走，每次走一步，
 * 那么相遇结点就是环的入口点
 */
public class Solutioin {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode EntryNodeOfLoop(ListNode pHead){
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode pFast = pHead;
        ListNode pSlow = pHead;
        while (pFast != null && pFast.next != null){
            pFast = pFast.next.next;
            pSlow = pSlow.next;
            if (pFast == pSlow){
                break;
            }
        }
        pFast = pHead;
        while (pFast != pSlow){
            pFast = pFast.next;
            pSlow = pSlow.next;
        }
        return pSlow;
    }
}

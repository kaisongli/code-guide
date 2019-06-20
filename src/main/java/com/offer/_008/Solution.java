package com.offer._008;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
      if (pHead == null || pHead.next == null){
          return null;
      }
      ListNode pFast = pHead;
      ListNode pSlow = pHead;
      while (pFast.next != null){
          pSlow = pSlow.next;
          pFast = pFast.next.next;
          if (pFast == pSlow){
              break;
          }
      }
      pFast = pHead;
      while (pFast != pSlow){
          pSlow = pSlow.next;
          pFast = pFast.next;
      }
      return pFast;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
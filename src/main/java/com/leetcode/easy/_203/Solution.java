package com.leetcode.easy._203;

/**
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 *
 * 解法：
 * 链表的基本操作，不过需要注意边界值
 * 如果头节点就是需要删除的节点的情况 --->采用虚拟节点
 * 如果连续两个节点都是要删除的节点的情况
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dumpyNode = new ListNode(-1);
        dumpyNode.next = head;
        ListNode curNode = dumpyNode;
        while (curNode.next != null){
            if (curNode.next.val == val){
                curNode.next = curNode.next.next;
            }else {
                curNode = curNode.next;
            }
        }
        return dumpyNode.next;
    }
}

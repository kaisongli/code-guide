package com.leetcode.node._001;

/**
 * 给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间删除该节点。
 */

/**
 * 解法：
 * 把下一个节点的内容复制到待删除节点上，覆盖原有的内容，再把下一个节点删除，那就相当于把当前要删除的节点删除了。
 * 举个栗子，我们要删除的节点A，先把A的下一个节点B的内容复制到A，然后把A的指针指向节点B的下一个节点。此时节点B被删除，但B的内容复制到A节点上了，其效果就刚好是把节点A给删除了。
 * 要注意两种情况：
 * 如果链表中只有一个节点，即头节点等于要删除的节点，此时我们在删除节点之后，头节点就变为NULL了。
 * 如果要删除的节点位于链表的尾部，那么它就没有下一个节点，这时我们就要从链表的头节点开始，顺序遍历得到该节点的前序节点，并完成删除操作。
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode deleteNode(ListNode head, ListNode toBeDeleted) {
        // 如果输入参数有空值就返回表头结点
        if (head == null || toBeDeleted == null) {
            return head;
        }
        // 如果删除的是头结点，直接返回头结点的下一个结点
        if (head == toBeDeleted) {
            return head.next;
        }
        // 下面的情况链表至少有两个结点
        // 在多个节点的情况下，如果删除的是最后一个元素
        if (toBeDeleted.next == null) {
            // 找待删除元素的前驱
            ListNode tmp = head;
            while (tmp.next != toBeDeleted) {
                tmp = tmp.next;
            }
            // 删除待结点
            tmp.next = null;
        }
        // 在多个节点的情况下，如果删除的是某个中间结点
        // 将下一个结点的值输入当前待删除的结点
        toBeDeleted.val = toBeDeleted.next.val;
        // 待删除的结点的下一个指向原先待删除引号的下下个结点，即将待删除的下一个结点删除
        toBeDeleted.next = toBeDeleted.next.next;
        // 返回删除节点后的链表头结点
        return head;
    }
}

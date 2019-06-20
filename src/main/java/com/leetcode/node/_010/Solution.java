package com.leetcode.node._010;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */

/**
 * 解题思路：
 * 条件1 list1为空 直接返回list2
 * 条件2 list2为空 直接返回list1
 * 方法一：
 * 每一次合并下个节点都是相同的操作，可以使用递归
 * 方法二 ：
 * 非递归
 * 判断list1和list2的节点值的大小，找出合并后的首个节点mergeNode
 * 新增工作节点cur等于合并后的首个节点mergeNode
 * 主要有三种情况
 * 1、list1和list2都不为空，这时要判断list1和list2结点的只大小
 * 2、list1为空 cur的下一个结点就是list2
 * 3、list2为空 cur的下一个结点就是list1
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
     * 递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }
        ListNode mergeNode = null;
        if (list1.val >= list2.val){
            mergeNode = list2;
            mergeNode.next = Merge(list1, list2.next);
        } else {
            mergeNode = list1;
            mergeNode.next = Merge(list1.next, list2);
        }
        return mergeNode;
    }

    /**
     * 非递归
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge2(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }
        ListNode mergeNode = null;
        if (list1.val >= list2.val){
            mergeNode = list2;
            mergeNode.next = list2.next;
        } else {
            mergeNode = list1;
            mergeNode.next = list1.next;
        }
        ListNode cur = mergeNode;
        while(list1 != null && list2 != null){
            if(list1.val >= list2.val){
                cur.next = list2;
                list2 = list2.next;
            }else{
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        if(list1 == null) {
            cur.next = list2;
        }
        else if(list2 == null) {
            cur.next = list1;
        }
        return mergeNode;
    }
}

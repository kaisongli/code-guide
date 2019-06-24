package com.leetcode.easy._104;

/**
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 * <p>
 * 解法：
 * 树是一种递归的数据结构，因此用递归去解决的时候往往非常容易
 * 时间复杂度：我们每个结点只访问一次，因此时间复杂度为 O(N)， 其中 N 是结点的数量。
 * 空间复杂度：在最糟糕的情况下，树是完全不平衡的，例如每个结点只剩下左子结点，递归将会被调用 N次（树的高度），因此保持调用栈的存储将是 O(N)。
 * 但在最好的情况下（树是完全平衡的），树的高度将是 log(N)。因此，在这种情况下的空间复杂度将是 O(log(N))。
 */
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * 递归解法
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        //等价于
//        if (root == null) {
//            return 0;
//        } else {
//            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
//        }
    }
}
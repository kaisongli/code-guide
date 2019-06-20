package com.leetcode.easy._88;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 解法：
 * 从后往前比较插入
 * 需要三个指针p1、p2和curP，分别指向num1、num2和合并后的数组的位置
 * 如果p1所指的值大于p2所指的值，那么当前指针值curP为p1所指的值，p1和curP分别往前移一步
 * 否则的话，当前指针值curP为p2所指的值，p2和curP分别往前移一步
 * 最后从num2中添加缺失的值到数组num1中
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int curP = m + n - 1;
        while (p1 >= 0 && p2 >= 0){
            nums1[curP--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
//            等价于
//            if (nums1[p1] > nums2[p2]){
//                nums1[curP] = nums1[p1];
//                curP --;
//                p1 --;
//            }else {
//                nums1[curP] = nums2[p2];
//                curP --;
//                p2 --;
//            }
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}

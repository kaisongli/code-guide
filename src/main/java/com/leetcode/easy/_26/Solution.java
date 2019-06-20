package com.leetcode.easy._26;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 *
 * 解法：
 * 双指针
 * 快慢指针分别指向第一个数
 * 遍历过程中
 * 如果快慢指针的数值相等，那就快指针往前走一步
 * 否则的话，将慢指针的下一个数值指向快指针的数值，然后快慢指针分别往前走一步
 *
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int low = 0;
        int fast = 0;
        while (fast < nums.length){
            if (nums[low] == nums[fast]){
                fast ++;
            }else {
                nums[low + 1] = nums[fast];
                low ++;
                fast ++;
            }
        }
        return low + 1;
    }
}

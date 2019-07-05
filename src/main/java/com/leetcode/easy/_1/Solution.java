package com.leetcode.easy._1;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 解法：
 * 设置一个 map 用来记录元素的值与索引，然后遍历数组 nums。
 *
 * 每次遍历时使用临时变量 otherNum 用来保存目标值与当前值的差值
 * 在遍历中查找 map 是否有与 otherNum 一致的值，如果查找成功则返回查找值的索引值与当前变量的值 i
 * 如果未找到，则在 map 保存该元素与索引值 i
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int otherNum = 0;
        for (int i = 0; i < nums.length; i++) {
            otherNum = target - nums[i];
            if (map.containsKey(otherNum)) {
                return new int[]{map.get(otherNum), i};
            }
            map.put(nums[i], i);

        }
        return null;
    }
}

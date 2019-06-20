package com.leetcode.array._001;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。

 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

 示例:

 给定 nums = [2, 7, 11, 15], target = 9

 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1]
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 解法：
 * 一遍哈希表
 在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。
 如果它存在，那我们已经找到了对应解，并立即将其返回。
 复杂度分析：
 时间复杂度：O(n)，我们只遍历了包含有n个元素的列表一次。在表中进行的每次查找只花费O(1)的时间。
 空间复杂度：O(n)，所需的额外空间取决于哈希表中存储的元素数量，该表最多需要存储 n个元素。
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        for (int i = 0 ; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args){
        for (int i : new Solution().twoSum(new int[]{2, 7, 11, 15}, 9)){
            System.out.println(i);
        }
    }
}

package com.leetcode.easy._172;

/**
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 *
 * 解法：
 * 末尾唯一的零来自于 2 * 5。很显然，如果需要产生零，阶乘中的数需要包含 2 和 5 这两个因子。
 * 因此，我们只要数一数组成阶乘的数中共有多少对 2 和 5 的组合即可。
 * 又因 5 的个数一定比 2 少，问题简化为计算 5 的个数就可以了。
 */
public class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n >= 5){
            res += n / 5;
            n /= 5;
        }
        return res;
    }
}

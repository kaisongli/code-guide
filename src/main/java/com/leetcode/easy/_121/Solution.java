package com.leetcode.easy._121;

/**
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * <p>
 * 注意你不能在买入股票前卖出股票。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 * 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * <p>
 * 解法：
 * 形成波峰图，我们要找的就是峰值和谷值，可以维护两个两个变量，分别代表谷值和最大利润值:
 * 前i天的最大收益 = max{前i-1天的最大收益，第i天的价格-前i-1天中的最小价格}
 * 在遍历过程中，如果当前数值小于谷值，那么谷值即为当前数值
 * 如果当前数值减去谷值的结果大于最大利润值，那么最大利润值即为当前数值减去谷值的结果
 *
 * 复杂度分析
 *
 * 时间复杂度：O(n)，只需要遍历一次。
 * 空间复杂度：O(1)，只使用了两个变量。
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i ++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
package com.offer._006;

/**
 * 题目描述
 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution {
    /**
     * 把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.
     * 那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。
     * @param n
     * @return
     */
    public int NumberOf1(int n) {
        int sum = 0;
        while (n != 0){
            n &= (n - 1);
            ++ sum;
        }
        return sum;
    }
}

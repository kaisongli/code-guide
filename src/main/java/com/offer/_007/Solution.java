package com.offer._007;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution {
    /**
     * 使用递归，时间复杂度O(logn)
     当n为偶数，a^n =（a^n/2）*（a^n/2）
     当n为奇数，a^n = a^[(n-1)/2] * a^[(n-1)/2] * a
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        double res = 1.0;
        if (base == 0){
            return 0;
        }
        if (exponent == 0){
            return res;
        }
        int n = exponent > 0 ? exponent : (-exponent);
        //n/2
        res = Power(base, n>>1);
        res *= res;
        //判断奇数
        if ((exponent &1) == 1){
            res *= base;
        }
        return exponent > 0 ? res : 1/res;
    }
}

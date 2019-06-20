package com.leetcode.array._832;

import java.util.Arrays;

/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。

 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。

 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。

 示例 1:

 输入: [[1,1,0],[1,0,1],[0,0,0]]
 输出: [[1,0,0],[0,1,0],[1,1,1]]
 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        if (A == null) {
            return null;
        }
        for (int[] row : A) {
            if (row == null) {
                continue;
            }
            for (int i = 0, j = row.length - 1; i < j; i++, j--) {
                int tmp = row[i];
                row[i] = row[j];
                row[j] = tmp;
            }
            for (int i = 0; i < row.length; i++) {
                row[i] = row[i] ^ 1;
            }
        }
        return A;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(new Solution().flipAndInvertImage(new int[][] {{1,1,0},{1,0,1},{0,0,0}})));
    }
}

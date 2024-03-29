package com.offer._001;

/**
 * 题目描述
 在一个二维数组中（每个一维数组的长度相同），
 每一行都按照从左到右递增的顺序排序，
 每一列都按照从上到下递增的顺序排序。
 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int[][]array){
        boolean find = false;
        if(array != null){
            int rows = array.length;
            int columns = array[0].length;
            int row = 0;
            int column = columns - 1;
            while (row < rows && column >= 0){
                if(array[row][column] == target){
                    find = true;
                    break;
                }
                else if(array[row][column] > target){
                    column --;
                }else {
                    row ++;
                }
            }
        }
        return find;
    }
}
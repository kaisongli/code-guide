package com.leetcode.sort;

/**
 * Created by likaisong on 2019/4/14.
 */

/**
 * 每次循环查找最小的值
 */
public class SelectionSort {
    public static void selectionSort(int[] array) {
        if (array == null || array.length == 0){
            return;
        }
        int tmp, min;
        for (int i = 0; i < array.length - 1; i ++){
            min = i;
            for (int j = i + 1; j < array.length; j ++){
                if (array[min] > array[j]){
                    min = j;
                }
            }
            if (min != i){
                tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {1, 5, 8, 0, 4, 6};
        selectionSort(array);
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }
    }
}

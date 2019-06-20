package com.leetcode.sort;

/**
 * Created by likaisong on 2019/4/14.
 */
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int tmp;
        boolean swap = false;
        for (int i = array.length - 1; i > 0; i --) {
            swap = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swap = true;
                }
            }
            if (swap = false){
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 5, 8, 0, 4, 6};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

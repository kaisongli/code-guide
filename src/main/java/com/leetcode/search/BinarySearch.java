package com.leetcode.search;

/**
 * Created by likaisong on 2019/5/2.
 */
public class BinarySearch {
    public static boolean recursionBinarySearch(int[] array, int key, int left, int right){
        if (array == null || array.length == 0 || left > right){
            return false;
        }
        int mid = (left + right) / 2;
        if (array[mid] == key){
            return true;
        } else if (array[mid] > key){
            return recursionBinarySearch(array, key, left, mid - 1);
        } else {
            return recursionBinarySearch(array, key, mid + 1, right);
        }
    }


    public static boolean commonBinarySearch(int[] array, int key){
        if (array == null || array.length == 0){
            return false;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (left <= right){
            mid = (left + right) / 2;
            if (array[mid] == key){
                return true;
            }else if (array[mid] > key){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(BinarySearch.commonBinarySearch(array, 4));
        System.out.println(BinarySearch.recursionBinarySearch(array, 4, 0,5));
    }
}

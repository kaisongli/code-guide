package com.data_structure;

/**
 * Created by likaisong on 2018/12/14.
 */
public class BinarySearch {
    public static boolean find(int []arr, int target){
        if (arr == null || arr.length < 1){
            return false;
        }
        int lowIndex = 0;
        int highIndex = arr.length - 1;
        while (lowIndex <= highIndex){
            int midIndex = (lowIndex + highIndex) / 2;
            if (arr[midIndex] == target){
                return true;
            }else if (arr[midIndex] > target){
                highIndex = midIndex - 1;
            }else {
                lowIndex = midIndex + 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(BinarySearch.find(new int[]{1, 2, 3, 4, 5, 6}, 0));
    }
}

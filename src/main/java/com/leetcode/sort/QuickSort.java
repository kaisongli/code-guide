package com.leetcode.sort;

/**
 * 算法描述
 * 从数列中挑出一个元素，称为”基准”（pivot），
 * 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任何一边）。
 * 在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
 * 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * <p>
 * 稳定性
 * 快速排序并不是稳定的。这是因为我们无法保证相等的数据按顺序被扫描到和按顺序存放。
 * <p>
 * 复杂度
 * 平均O(nlogn) 最坏O(n^2)
 */
public class QuickSort {

    /**
     * 快排
     * @param array
     */
    public static void quickSort(int[] array) {
        if (array == null || array.length ==0){
            return;
        }
        qSort(array, 0, array.length - 1);
    }

    private static void qSort(int[] array, int left, int right) {
        if (left > right){
            return;
        }
        int index = partion(array, left, right);
        qSort(array, left, index - 1);
        qSort(array, index + 1, right);
    }

    private static int partion(int[] array, int left, int right) {
        int povint = array[left];
        while (left < right){
            if (left < right && array[right] >= povint){
                right --;
            }
            array[left] = array[right];
            if (left < right && array[left] <= povint){
                left ++;
            }
            array[right] = array[left];
        }
        array[left] = povint;
        return left;
    }

    public static int findKthNum(int[] array, int kTh){
        if (array == null || array.length == 0 || array.length < kTh){
            return -1;
        }
        return findKthNumber(array, kTh, 0, array.length - 1);
    }

    private static int findKthNumber(int[] array, int kTh, int left, int right) {
        if (left > right){
            return -1;
        }
        int index = findKthPartion(array, left, right);
        if (index == kTh - 1){
            return array[index];
        } else if (index > kTh - 1){
            return findKthNumber(array, kTh, left, index - 1);
        } else {
            return findKthNumber(array, kTh, index + 1, right);
        }
    }

    private static int findKthPartion(int[] array, int left, int right) {
        int povit = array[left];
        while (left < right){
            if (left < right && array[right] <= povit){
                right --;
            }
            array[left] = array[right];
            if (left < right && array[left] >= povit){
                left ++;
            }
            array[right] = array[left];
        }
        array[left] = povit;
        return left;
    }

    public static void main(String[] args){
        int[] array = {1, 5, 8, 0, 4, 5, 6};
        quickSort(array);
        for (int i = 0; i < array.length; i ++){
            System.out.println(array[i]);
        }

       System.out.println(findKthNum(array, 2));
    }

}

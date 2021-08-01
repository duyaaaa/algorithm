package com.wsf.algorithm.sort;

/**
 * 归并排序
 *
 * @author weisifan
 */
public class Merge {


    /**
     * 归
     *
     * @param array
     * @param left
     * @param right
     */
    public void sort(int[] array, int left, int right) {

        //base case
        if (left == right) {
            return;
        }

        //寻找 mid
        int mid = (right + left) / 2;
        //左
        sort(array, left, mid);
        //右
        sort(array, mid + 1, right);
        //并
        merge(array, left, mid, right);
    }

    /**
     * 并
     *
     * @param array
     * @param left
     * @param mid
     * @param right
     */
    public void merge(int[] array, int left, int mid, int right) {

        int[] help = new int[right - left + 1];

        int i = 0;

        int p1 = left;

        int p2 = mid + 1;

        while (p1 <= mid && p2 <= right) {
            help[i++] = array[p1] >= array[p2] ? array[p2++] : array[p1++];
        }

        while (p1 <= mid) {
            help[i++] = array[p1++];
        }

        while (p2 <= right) {
            help[i++] = array[p2++];
        }

        for (int j = 0; j < help.length; j++) {
            array[j + left] = help[j];
        }

    }
}

package com.wsf.algorithm.search;

/**
 * 获取最大值
 *
 * @author weisifan
 */
public class GetMax {

    public int getMax(int[] arr) {
        return process(arr, 0, arr.length - 1);
    }

    public int process(int[] arr, int left, int right) {
        if (left == right) {
            return arr[left];
        }

        int mid = (left + right) / 2;
        int leftMax = process(arr, left, mid);
        int rightMax = process(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }


}

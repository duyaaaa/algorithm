package com.wsf.algorithm.search;

/**
 * 二分查找
 *
 * @author weisifan
 */
public class Binary {


    public boolean binary(int[] arr, int num) {

        if (arr == null || arr.length == 0) {
            return false;
        }

        int left = 0;

        int right = arr.length - 1;

        //不写 <= 的话, arr=[5], 查询 5 的时候失败
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > num) {
                right = mid - 1;
            } else if (arr[mid] < num) {
                left = mid + 1;
            } else {
                return true;
            }
        }


        return false;
    }

}

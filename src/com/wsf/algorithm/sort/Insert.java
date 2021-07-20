package com.wsf.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 思想: 0~0 有序/ 0~1 有序/ 0~2 有序
 * 打扑克牌
 *
 * @author weisifan
 */
public class Insert {

    public static void main(String[] args) {

        int[] a = {147, 23, 56, 15, 78, 354, 258};

//        for (int i = 1; i < a.length; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (j - 1 == -1) {
                    continue;
                }
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}

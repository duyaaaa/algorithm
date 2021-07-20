package com.wsf.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 思路:每次找到最大的,放入结尾
 *
 * @author weisifan
 */
public class Rubble {

    public static void main(String[] args) {

        int[] a = {147, 23, 56, 15, 78, 354, 258};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}

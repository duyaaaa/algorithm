package com.wsf.algorithm.sort;

import java.util.*;

/**
 * 选择排序.
 * 思路: 每次遍历找到最小的值,放入 0 的位置.
 *
 * @author weisifan
 */
public class Selection {

    public static void main(String[] args) {
        int[] arrays = {147, 23, 56, 15, 78, 354, 258};

        for (int i = 0; i < arrays.length - 1; i++) {
            int flag = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[flag] > arrays[j]) {
                    flag = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[flag];
            arrays[flag] = temp;
        }

        System.out.println(Arrays.toString(arrays));

    }

}

package com.wsf.algorithm.queue;

/**
 * 使用数组实现队列
 * 采用双指针,分别指向弹出位置,放入位置
 * 使用 size, limit 来限制
 *
 * @author weisifan
 */
public class ArrayQueue {

    private int putIndex;

    private int pollIndex;

    private int size;

    private final int limit = 8;

    private int[] array = new int[8];

    public ArrayQueue() {
        putIndex = 0;
        pollIndex = 0;

    }

    public void put(int num) {
        if (size == limit) {
            throw new RuntimeException("队列满了,不允许放了");
        }
        size++;
        array[putIndex] = num;
        putIndex = nextIndex(putIndex);
    }

    public int poll() {
        if (size == 0) {
            throw new RuntimeException("队列空");
        }
        size--;
        int result = array[pollIndex];
        pollIndex = nextIndex(pollIndex);
        return result;
    }


    private int nextIndex(int index) {
        return index < limit - 1 ? 0 : index + 1;
    }

}

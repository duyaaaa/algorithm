package com.wsf.algorithm.node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weisifan
 */
public class ReverseNode {

    /**
     * 反转单向链表
     *
     * @param head
     * @return
     */
    public Node reverseNode(Node head){
        Node prev = null;

        Node next = null;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;

    }

    /**
     * 反转双向链表
     *
     * @param head
     * @return
     */
    public DoubleNode reverseDoubleNode(DoubleNode head){
        DoubleNode prev = null;

        DoubleNode next = null;

        while (head != null) {

            next = head.next;

            head.next = prev;
            head.prev = next;

            prev = head;

            head = next;

        }

        return prev;
    }

}

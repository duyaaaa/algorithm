package com.wsf.algorithm.node;

/**
 * 删除给定数字
 *
 * @author weisifan
 */
public class DeleteGivenNum {

    public Node deleteGivenNum(Node head, int num){
        //1.找到头部
        while (head != null) {
            if (head.value == num) {
                head = head.next;
            } else {
                break;
            }
        }

        //2.去除 num. 将 prev 指向next.next
        Node prev = head;
        Node curr = head;

        while (curr != null) {
            if (curr.value == num) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return head;
    }

}

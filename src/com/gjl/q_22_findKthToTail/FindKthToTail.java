/**
 * Filename: FindKthToTail
 * Author: gjl
 * Date : 2019/1/11 19:54
 * Description :
 */
package com.gjl.q_22_findKthToTail;/*
 *用户 Administrator
 *编辑时间 2019/1/11
 *
 *输入一个链表，输出该链表中倒数的第K个节点。
 */

import javax.swing.plaf.basic.BasicListUI;

public class FindKthToTail {
    static class ListNode{
        int value;
        ListNode next;

        public ListNode(int value){
            this.value = value;
        }
    }

    public ListNode findKthToTail(ListNode ListHead,int k){
        if(ListHead ==null || k ==0)
            return null;

        ListNode paHead = ListHead;
        ListNode pbHead = null;
        for (int i = 0; i <k-1 ; i++) {
            if(paHead.next != null){
                paHead = paHead.next;
            }else{
                return null;
            }
        }

        pbHead = ListHead;
        while(paHead.next !=null){
            paHead = paHead.next;
            pbHead = pbHead.next;
        }
        return pbHead;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        ListNode list4 = head.next.next.next.next;
        list4.next = new ListNode(5);
        list4.next.next = new ListNode(6);

        FindKthToTail f = new FindKthToTail();
        ListNode node = f.findKthToTail(head,3);
        System.out.println(node.value);
    }
}

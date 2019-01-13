/**
 * Filename: MergeListNode
 * Author: gjl
 * Date : 2019/1/12 17:35
 * Description :
 */
package com.gjl.q_25_Merge;/*
 *用户 Administrator
 *编辑时间 2019/1/12
 *
 *
 */

public class MergeListNode {
    //定义链表
    static class ListNode{
        int value ;
        ListNode next;
        public ListNode(int value){
            this.value = value;
        }
    }

    public ListNode merge(ListNode head1,ListNode head2) {
        if (head1 == null && head2 == null)
            return null;

        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        ListNode mergeHead = null;
        if (head1.value < head2.value || head1.value == head2.value) {
            mergeHead = head1;
            mergeHead.next = merge(head1.next, head2);
        } else{
            mergeHead = head2;
            mergeHead.next = merge(head1, head2.next);
        }
        return mergeHead;

    }

    public static void main(String[] args) {
        ListNode listnode1 = new ListNode(1);
        ListNode listnode2 = new ListNode(1);
        ListNode listnode3 = new ListNode(3);
        ListNode listnode4 = new ListNode(4);
        ListNode listnode5 = new ListNode(5);
        ListNode listnode6 = new ListNode(6);
        ListNode listnode7 = new ListNode(7);
        ListNode listnode8 = new ListNode(8);
        listnode1.next = listnode3;
        listnode2.next = listnode4;
        listnode3.next = listnode5;
        listnode4.next = listnode6;
        listnode5.next = listnode7;
        listnode6.next = listnode8;

        ListNode head1 = listnode1;
        ListNode head2 = listnode2;

        MergeListNode m = new MergeListNode();
       ListNode resultnode =  m.merge(head1,head2);
        System.out.println(resultnode.value);
        System.out.println(resultnode.next.value);
        System.out.println(resultnode.next.next.value);
    }
}

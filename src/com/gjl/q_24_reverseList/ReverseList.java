/**
 * Filename: ReverseList
 * Author: gjl
 * Date : 2019/1/11 22:08
 * Description :
 */
package com.gjl.q_24_reverseList;/*
 *用户 Administrator
 *编辑时间 2019/1/11
 *
 *定义一个函数，输入一个链表的头节点，翻转该链表并输出反转后链表的头节点。
 */



public class ReverseList {
    static class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head){
        if(head == null || head.next ==null)
            return null;

        ListNode reverseHead = null;
        ListNode pNode = head;
        ListNode preNode = null;
        ListNode pNext = pNode.next;

        while(pNext != null){

            reverseHead = pNext.next;
            pNext.next = pNode;
            pNode = pNext;
            pNext=reverseHead;

        }

        return pNode;
    }

    public static void main(String[] args) {
        ListNode listnode1 = new ListNode(1);
        ListNode listnode2 = new ListNode(2);
        ListNode listnode3 = new ListNode(3);
        ListNode listnode4 = new ListNode(4);
        ListNode listnode5 = new ListNode(5);
        ListNode listnode6 = new ListNode(6);
        ListNode listnode7 = new ListNode(7);
        ListNode listnode8 = new ListNode(8);
        listnode1.next = listnode2;
        listnode2.next = listnode3;
        listnode3.next = listnode4;
        listnode4.next = listnode5;
        listnode5.next = listnode6;
        listnode6.next = listnode7;
        listnode7.next = listnode8;

        ListNode head = listnode1;

        ReverseList r = new ReverseList();
        ListNode head1 = r.reverseList(head);
        System.out.println(head1.value);
    }
}

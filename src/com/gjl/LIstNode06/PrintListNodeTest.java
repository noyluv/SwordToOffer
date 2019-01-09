/**
 * Filename: PrintListNodeTest
 * Author:
 * Date : 2019/1/7 21:32
 * Description :
 */
package com.gjl.LIstNode06;/*
 *用户 Administrator
 *编辑时间 2019/1/7
 *
 *
 */

import java.util.ArrayList;

public class PrintListNodeTest {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);

        PrintListNode list = new PrintListNode();
        ArrayList<Integer> li = new ArrayList<>();
       // li = list.printListwithStack(node1);
        li = list.printListFromTailToHead(node1);
        System.out.println(li);



    }
}

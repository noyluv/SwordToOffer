/**
 * Filename: PrintListNode
 * Author: gjl
 * Date : 2019/1/7 21:17
 * Description :
 */
package com.gjl.LIstNode06;/*
 *用户 Administrator
 *编辑时间 2019/1/7
 *
 *
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintListNode {
     //递归实现
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode != null){
            ListNode next = listNode.next;
            list.addAll(printListFromTailToHead(next));//先递归打印子序列
            list.add(listNode.data);//在打印数据
        }
        return list;
    }

    public ArrayList<Integer> printListwithStack(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> stack = new LinkedList<>();

        while(listNode != null){
            stack.push(listNode.data);
            listNode = listNode.next;
        }

        for(Integer i : stack){
            list.add(i);
        }
        return list;
    }

}

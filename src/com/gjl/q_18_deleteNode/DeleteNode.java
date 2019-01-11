/**
 * Filename: DeleteNode
 * Author: gjl
 * Date : 2019/1/10 17:51
 * Description :
 */
package com.gjl.q_18_deleteNode;/*
 *用户 Administrator
 *编辑时间 2019/1/10
 *题目：给定单项链表的头指针和一个节点指针，定义一个函数在O(1)的时间内删除该节点。
 *删除链表中指定的节点，采用方法;将要删除的节点的下一个节点的内容覆盖到要删除的节点的内容，
 * 然后删除要删除的节点的下一个节点，
 */

import java.util.List;

public class DeleteNode {

    //链表的定义
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }


    public void deleteNode(ListNode listhead, ListNode toBeDelete){
        if(listhead ==null || toBeDelete ==null){
            return;
        }

        if(toBeDelete.next != null){  //要删除的节点不是尾节点
            ListNode next = toBeDelete.next;
            toBeDelete.val = next.val;
            toBeDelete.next = next.next;
            next = null;
        }else if(listhead == toBeDelete){  //链表只有一个节点，删除头节点
            listhead =null;
            toBeDelete =null;
        }else{  //链表中有多个节点，要删除的是尾节点
            ListNode node = listhead;
            while(node.next != toBeDelete){
                node = node.next;
            }
            node.next =null;
            toBeDelete = null;
        }

    }

    /**
     * 功能描述：删除链表中重复的节点，重复的节点全部不保留
     *@param :
     * @return :
     */

    public ListNode deleteDuplication(ListNode head){

        if(head ==null || head.next == null){
            return head;
        }

        ListNode preNode = null;//当前节点之前访问过的节点
        ListNode node = head;//当前节点
        ListNode pNext = null;//当前节点的下一个节点
        //当前节点不为空
        while(node != null){
             pNext = node.next;
            //当前节点的值等于下一个节点的值
            if(pNext != null && pNext.val == node.val){

                //找到所有的重复节点，删除节点既是将第一个重复节点的前一个节点的指针指向最后一个重复节点的下一个节点的位置
                //找到重复的节点的最后一个位置
                while(pNext.next != null && pNext.next.val == node.val){
                    pNext = pNext.next;
                }
                //如果当前节点只指向头节点
                if(node == head){
                    head = pNext.next;
                }else{  //当前节点不指向头节点
                    preNode.next = pNext.next;
                }
                node = pNext.next;

            }else{ //当前节点的值和下一个节点的值不重复
                preNode = node;
                node = node.next;
            }
        }
        return  head;

    }


}

/**
 * Filename: ListEntryOfLoop
 * Author: gjl
 * Date : 2019/1/11 20:35
 * Description :
 */
package com.gjl.q_23_listEntryOfloop;/*
 *用户 Administrator
 *编辑时间 2019/1/11
 *
 *链表中环的入口
 */

public class ListEntryOfLoop {
    //链表的定义
    static class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 功能描述：在链表中存在环的情况下，找到一快一慢两个指针相遇的节点。
     * @param :
     * @return :
     */
    public ListNode meetingNode(ListNode head){//传入链表头指针
        if(head == null || head.next==null ){
            return null;
        }
        ListNode pSlow = head;
        ListNode pFast = head.next;
        if(pFast.next.next !=null)
            while(pFast !=null && pSlow != null){
                if(pFast == pSlow){
                    return pFast;
                }
                pSlow = pSlow.next;
                pFast = pFast.next.next;

            }
        return null;

    }
    /**
     * 功能描述：   找到环中任意一个节点后，就可以找出环中节点的数目，并找到环的入口节点
     *@param :
     * @return :
     */
    public ListNode EntryNodeOfLoop(ListNode head){
        ListNode meetingNode = meetingNode(head);
        if(meetingNode == null)
            return null;

        //得到环中节点的数目
        int nodesInLoop = 1;
        ListNode pNode1 = meetingNode;
        while(pNode1.next!= meetingNode){
            pNode1 = pNode1.next;
            nodesInLoop++;
        }
        System.out.println("环中节点的数目为："+nodesInLoop);

        //先移动pNode1，次数为环中节点的数目
        pNode1 = head;
        for(int i=0;i<nodesInLoop;i++){
            pNode1 = pNode1.next;
        }
        //再移动pNode2和pNode1
        ListNode pNode2 = head;
        while(pNode1 != pNode2){
            pNode1 = pNode1.next;
            pNode2 = pNode2.next;
        }
        return pNode1;
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
        listnode8.next = listnode4;
        ListNode head = listnode1;


        ListEntryOfLoop loop = new ListEntryOfLoop();
        ListNode node = loop.meetingNode(head);
        System.out.println(node.value);
        ListNode node2 = loop.EntryNodeOfLoop(head);
        System.out.println("入口节点的值为："+node2.value);


    }

}

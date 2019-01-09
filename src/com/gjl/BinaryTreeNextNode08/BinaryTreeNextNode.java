/**
 * Filename: BinaryTreeNextNode
 * Author:
 * Date : 2019/1/8 17:36
 * Description :
 */
package com.gjl.BinaryTreeNextNode08;/*
 *用户 Administrator
 *编辑时间 2019/1/8
 *
 *给定一颗二叉树和其中的一个节点，找出中序遍历的下一个节点
 * 注意：树中的节点不仅包括左右子节点，还包括指向父节点的指针
 */

public class BinaryTreeNextNode {

    public  class BinaryTreeNode{
        int value;
        BinaryTreeNode left =null;
        BinaryTreeNode right =null;
        BinaryTreeNode parent = null;
        public BinaryTreeNode(int value){
            this.value = value;
            this.left=left;
            this.right = right;
            this.parent = parent;
        }
    }

    public static BinaryTreeNode getNext(BinaryTreeNode node){
        BinaryTreeNode nextNode = null;
        if(node == null){
            return null;
        }
        //如果该节点的右子树不为空
        if(node.right != null){

            nextNode = node.right;
            while(nextNode.left != null){
                nextNode = nextNode.left;
            }
        }

        //如果该节点的右子树为空
        if(node.right == null){
            if(node.parent != null){
                //如果该节点是父节点的左子树
                if(node.parent.left == node){
                    System.out.println("该节点是父节点的左子树");
                    nextNode = node.parent;
                }else if(node.parent.right == node){ //如果该节点是父节点你的右子树
                    while(node.parent != null && node.parent.right == node){
                        System.out.println("该节点是父节点的右子树");
                        node = node.parent;
                    }
                    nextNode = node.parent;
                }

            }
        }
        return nextNode;
    }

    public static void main(String[] args) {

        BinaryTreeNextNode in=new BinaryTreeNextNode();
        //创建一棵树
        /**
         *                  1
         *        2                   3
         *    4       5            6      7
         *      8        9
         *
         */
        BinaryTreeNode root=in.new BinaryTreeNode(1);
        BinaryTreeNode node1=in.new BinaryTreeNode(2);
        BinaryTreeNode node2=in.new BinaryTreeNode(3);
        BinaryTreeNode node3=in.new BinaryTreeNode(4);
        BinaryTreeNode node4=in.new BinaryTreeNode(5);
        BinaryTreeNode node5=in.new BinaryTreeNode(6);
        BinaryTreeNode node6=in.new BinaryTreeNode(7);
        BinaryTreeNode node7=in.new BinaryTreeNode(8);
        BinaryTreeNode node8=in.new BinaryTreeNode(9);
        root.left=node1;
        root.right=node2;
        root.parent=null;
        node2.parent=root;
        node1.parent=root;
        node1.left=node3;
        node3.parent=node1;
        node1.right=node4;
        node4.parent=node1;

        node2.left=node5;
        node5.parent=node2;
        node2.right=node6;
        node6.parent=node2;
        node3.right=node7;
        node7.parent=node3;

        node4.right=node8;
        node8.parent=node4;
        BinaryTreeNode N1=getNext(node8);
        System.out.println(N1.value);
        BinaryTreeNode N2=getNext(node4);
        System.out.println(N2.value);
        BinaryTreeNode N3=getNext(node7);
        System.out.println(N3.value);
        BinaryTreeNode N4=getNext(node6);




    }

}

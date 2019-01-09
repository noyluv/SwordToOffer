/**
 * Filename: QueuewithStack
 * Author: gjl
 * Date : 2019/1/8 20:28
 * Description :
 */
package com.gjl.queuewithtwostack09;/*
 *用户 Administrator
 *编辑时间 2019/1/8
 *用两个栈实现一个队列，并实现他的两个函数appendTail 和deleteHead
 *完成在队列尾部插入数据和在队列头部删除数据的功能
 */

import java.util.Stack;

public class QueuewithStack<T> {

       //实现插入队列，只用于插入数据
       Stack<T> stack1 = new Stack<>();
       //实现删除队列，只用于删除数据
       Stack<T> stack2 = new Stack<>();

       public QueuewithStack(){}
        //添加的操作，在队列尾添加
       public void appendTail(T t){
           stack1.add(t);
       }

       //删除的操作，在队列的头部删除
    public T  deleteHead(){
            //先判断弹出的栈中是否为空
           if(stack2.isEmpty()) {
               while (!stack1.isEmpty()) {

                   stack2.push(stack1.pop());
               }
           }


           //如果弹出的栈中还是没有数据，就抛出异常
        if(stack2.isEmpty()){
            throw new RuntimeException("NO element");
        }
        return stack2.pop();
    }


}

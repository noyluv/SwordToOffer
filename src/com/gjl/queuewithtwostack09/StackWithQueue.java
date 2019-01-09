/**
 * Filename: StackWithQueue
 * Author: gjl
 * Date : 2019/1/8 22:03
 * Description :
 */
package com.gjl.queuewithtwostack09;/*
 *用户 Administrator
 *编辑时间 2019/1/8
 *
 *两个队列实现一个栈
 */

import java.util.ArrayList;

public class StackWithQueue<T> {
    //queue1作为添加元素的队列
    ArrayList<T>  queue1 = new ArrayList<>();

    ArrayList<T>  queue2 = new ArrayList<>();

    //元素入栈
    public void push(T t){
       queue2ToQueue1();
        queue1.add(t);
    }
    //元素出栈
    public T pop(){

        if(queue1.isEmpty()){
           throw new RuntimeException("No Element");
        }else{
            for(int i=0;i<queue1.size()-1;i++)
                queue2.add(queue1.remove(i));
        }
        T ss =  queue1.remove(0);
        queue2ToQueue1();
        return ss;
    }

    public void queue2ToQueue1(){
        if(!queue2.isEmpty()){
            for(int i=0;i<queue2.size();i++) {
                queue1.add(queue2.remove(i));
            }
        }
    }
}

/**
 * Filename: QueueTest
 * Author: gjl
 * Date : 2019/1/8 21:08
 * Description :
 */
package com.gjl.queuewithtwostack09;/*
 *用户 Administrator
 *编辑时间 2019/1/8
 *
 *
 */

public class QueueTest {
    public static void main(String[] args) {
        QueuewithStack<String> ss = new QueuewithStack<>();

        ss.appendTail("a");
        ss.appendTail("b");
        ss.appendTail("c");

        ss.deleteHead();
        ss.deleteHead();
       // ss.deleteHead();
        ss.appendTail("d");
        ss.appendTail("e");

        ss.deleteHead();



    }
}

/**
 * Filename: Test
 * Author:
 * Date : 2019/1/10 10:17
 * Description :
 */
package com.gjl.bitOperation_15;/*
 *用户 Administrator
 *编辑时间 2019/1/10
 *
 *
 */

public class Test {
    public static void main(String[] args) {
        BitOperation b = new BitOperation();
        int count = b.number(-12);  //计算机运算过程中是32位的存储空间，所以负数的count在不会大于32
        System.out.println(count);
    }
}

/**
 * Filename: Test
 * Author: gjl
 * Date : 2019/1/11 14:57
 * Description :
 */
package com.gjl.q_20_NumString;/*
 *用户 Administrator
 *编辑时间 2019/1/11
 *
 *
 */

public class Test {
    public static void main(String[] args) {
        NumString num  = new NumString();
        String str1 = "12.12e12";
        char[] a = str1.toCharArray();
        Boolean b = num.isNumeric(a);
        System.out.println(b);
    }
}

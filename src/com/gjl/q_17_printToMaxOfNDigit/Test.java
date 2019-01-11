/**
 * Filename: Test
 * Author: gjl
 * Date : 2019/1/10 14:46
 * Description :
 */
package com.gjl.q_17_printToMaxOfNDigit;/*
 *用户 Administrator
 *编辑时间 2019/1/10
 *
 *
 */

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        PrintMaxNDigit pp = new PrintMaxNDigit();
       //pp.print1ToMaxOfNDigits2(3);
        pp.print1ToMaxOfNDigits3(3);


        char mm[] = {'0'};
        int sum = mm[0] -'0'+1;
        mm[0] = (char)(sum +'0');
       // System.out.println(sum);
       // System.out.println(mm[0]);



    }

}

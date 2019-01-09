/**
 * Filename: ReplaceBlank
 * Author: gjl
 * Date : 2019/1/7 16:08
 * Description :
 */
package com.gjl.replaceBlank05;/*
 *用户 Administrator
 *编辑时间 2019/1/7
 *StringBuffer与StringBuilder的区别主要是前者是线程安全的，就是说它是同步的；后者不安全，不是同步的，
 * 其它的区别不大。当你的程序不需要线程同步，一般都用StringBuilder.
 *需要注意的是，String的值是不可变的，这就导致每次对String的操作都会生成新的String对象
 */

public class ReplaceBlank {
    public void replace(StringBuilder str){
        if(str == null || str.length()<0){
            System.out.println("请输入字符串");
        }

        int newStrLength = 0;
        int numberOfBlank = 0;
        for(int i=0;i< str.length();i++){
            if(str.charAt(i)==' ') numberOfBlank++ ;
        }
        newStrLength = str.length() + numberOfBlank * 2;
        StringBuilder  newStr = new StringBuilder(newStrLength);
        newStr.setLength(newStrLength);
        int i = str.length()-1 ;
        int j = newStrLength -1 ;
        while( i>= 0 &&  j >= i){
            if(str.charAt(i)==' '){
                newStr.setCharAt(j-- , '0');
                newStr.setCharAt(j-- , '2');
                newStr.setCharAt(j-- ,'%');
            }else{
                newStr.setCharAt(j--,str.charAt(i));
            }
            i--;
        }
        System.out.println(newStr);
    }
}

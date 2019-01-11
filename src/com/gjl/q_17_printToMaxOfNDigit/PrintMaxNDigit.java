/**
 * Filename: PrintMaxNDigit
 * Author: gjl
 * Date : 2019/1/10 14:45
 * Description :
 */
package com.gjl.q_17_printToMaxOfNDigit;/*
 *用户 Administrator
 *编辑时间 2019/1/10
 *
 *输入数字n，按顺序打印出从1到最大n位的十进制数,
 * 共展示了三种方法。
 */

public class PrintMaxNDigit {

//第一种的方法：不适用，容易溢出
    public void print1ToMaxOfNDigits1(int n){
        if(n<1){
            return;
        }

        int number =1;
        int i=0;
        while(number <= Math.pow(10,n)-1 ){
            number ++;
        }
        for (int j = 0; j <number ; j++) {
            System.out.println(j);
        }
    }
    //第二种方法：
    //在字符串上模拟数字加法的解法
    public void print1ToMaxOfNDigits2(int n){
        if(n<=0){
            return;
        }
        char[] number = new char[n];
        for (int i = 0; i <number.length ; i++) {
            number[i] = '0';
        }
        //每次都判断将要打印的数值是否越界
        while(!increment(number)){
            printNum(number);
        }

    }

    public boolean increment(char[] number){
        boolean isOverflow = false; //溢出标志
        int nTakeOver = 0;//进位标志
        for (int i = number.length-1; i >=0 ; i--) {
            int sum = number[i]-'0' + nTakeOver;
            if(i == number.length -1){
                sum ++ ;
            }
            if(sum >= 10){
                if(i==0){
                    isOverflow = true;
                }else{
                    sum -= 10;
                    nTakeOver =1;
                    number[i] = (char)(sum+'0');
                }
            }else{
                number[i] = (char)(sum +'0');
                break;
            }

        }
        return isOverflow;
    }

    public void printNum(char[] number){
        boolean isBegin0 = true;

        for (int i = 0; i <number.length; i++) {
            if(isBegin0 && number[i] != '0')  //从
                isBegin0 = false;
            if(!isBegin0){
                System.out.print(number[i]);
            }

        }


        System.out.println();
    }

    //第三种方法;
    public void print1ToMaxOfNDigits3(int n){
        if(n<0)
            return;

        char[] number = new char[n];
        for (int i = 0; i <number.length-1 ; i++) {
            number[i] = '0' ;
        }
        for (int i = 0; i < 10; i++) {
            number[0] =(char)( i +'0');
            print1ToMaxOfNDigitsRecurse(number,n,0);
        }
    }

    public void print1ToMaxOfNDigitsRecurse(char[] number, int length,int index ){
        if(index == length-1){
            printNum(number);
            return;
        }
        for (int i = 0; i <10 ; i++) {
            number[index+1] = (char)(i+'0');
            print1ToMaxOfNDigitsRecurse(number,length,index+1);
        }
    }

}

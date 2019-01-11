/**
 * Filename: BitOperation
 * Author: 郭建磊
 * Date : 2019/1/10 10:07
 * Description :
 */
package com.gjl.bitOperation_15;/*
 *用户 Administrator
 *编辑时间 2019/1/10
 *
 *输入一个整数，统计他的二进制中1的个数，
 * 思路：把一个整数减去1，在和原整数做与运算，会把该整数最右边的1变为0；
 */

public class BitOperation {
    public int number(int n) {
        int count = 0;
        if(n==0){
            return 0;
        }

        while(n !=0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }

}

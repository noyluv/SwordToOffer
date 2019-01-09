/**
 * Filename: Fibonacci
 * Author: gjl
 * Date : 2019/1/9 10:46
 * Description :
 */
package com.gjl.Fibonacci_10;/*
 *用户 Administrator
 *编辑时间 2019/1/9
 *
 *求斐波那契数列的第n项
 */

public class Fibonacci {

    /**
     * 功能描述：避免重复，从下往上计算，算出每一项，在类推，时间复杂度为O(n)
     *@param :
     * @return :
     */
    public long FibonacciOne(int n){
        int[] result= {0,1};
        if(n<2){
            return result[n];
        }

        long fibOne = 0;
        long fibTwo = 1;
        long fibN = 0;
        for(int i=2;i<=n ;i++){
            fibN = fibOne + fibTwo;

            fibOne = fibTwo;
            fibTwo = fibN;
        }
        return fibN;
    }

}

/**
 * Filename: Test
 * Author:
 * Date : 2019/1/11 16:38
 * Description :
 */
package com.gjl.q_21_reorderOddEvent;/*
 *用户 Administrator
 *编辑时间 2019/1/11
 *
 *
 */

public class Test {

    public static void main(String[] args) {
        int[] arr = {6,1,2,3,4,5,6,7,7,8,8,9,11,14};

        ReorderOddEvent rr = new ReorderOddEvent();
        int[] arr2 = rr.orederOdd(arr);
        for(int i =0;i<arr2.length;i++)
            System.out.print(arr2[i] +" ");
    }


}

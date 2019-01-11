/**
 * Filename: Cut
 * Author: gjl
 * Date : 2019/1/9 20:48
 * Description :
 */
package com.gjl.cutRope_14;/*
 *用户 Administrator
 *编辑时间 2019/1/9
 *
 *剪绳子，一段长为n的绳子，剪成m段，m,n,都大于1；
 */

public class Cut {

    public int maxProductAfterCutting(int length){//绳子的长度和剪的段数都大于1，既是至少剪成两段
        if(length < 2)
            return 0;
        if(length ==2)
            return 1;
        if(length ==3)
            return 2;

        int[] products = new int[length+1];
        products[0] = 0;
        products[1] =1;
        products[2] =2;
        products[3] =3;

        int max = 0;
        for(int i=4;i<=length;i++){
            for(int j=1;j<= i/2;j++){
                int product = products[j] * products[i-j];
                if(max < product)
                    max=product;

                products[i] =max;
            }

        }
        max = products[length];
        return max;
    }
    //贪婪算法
    public int maxProductAfterCuting2(int length){
        if(length <2)
            return 0;
        if(length ==2)
            return 1;
        if(length==3)
            return 2;

        //尽可能多的去剪长度为3 的绳子
        int timeOf3 = length /3;
        //当绳子只剩下最后4米
        if(length - timeOf3 * 3==1)
            timeOf3 -= 1;

        int timeOf2 = (length - timeOf3 * 3)/2;

        return (int)(Math.pow(3,timeOf3))*(int)(Math.pow(2,timeOf2));

    }
}

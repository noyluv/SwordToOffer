/**
 * Filename: Power
 * Author: gjl
 * Date : 2019/1/10 11:23
 * Description : 数值的整数次方
 */
package com.gjl.q_16_power;/*
 *用户 Administrator
 *编辑时间 2019/1/10
 *
 *数值base
 */

public class Power {

    public double power(double base,int exponent){
        int ex = exponent;
        if(ex == 0){
            return 1;
        }
        if(ex ==1)
            return base;
        if(ex<0){
            ex = -ex;
        }

        double result = power(base,ex >> 1);
        result *= result;
        //如果exponent是奇数，则要再乘一次本身
        if((ex & 1) ==1)
            result *= base;
        if(exponent < 0)
            result = 1 /result;

        return result;

    }
}

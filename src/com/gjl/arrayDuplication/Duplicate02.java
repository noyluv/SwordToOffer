/**
 * Filename: Duplicate02
 * Author:
 * Date : 2019/1/6 16:55
 * Description :
 */
package com.gjl.arrayDuplication;/*
 *用户 Administrator
 *编辑时间 2019/1/6
 *
 *利用哈希表的方式实现，
 */

import java.util.HashSet;

public class Duplicate02 {
    public void duplicate02(int arr[]){
        if(arr == null || arr.length <0){
            System.out.println("输入有误");
        }
        for(int i : arr){
            if(arr[i]<0 || arr[i]>arr.length-1)
                System.out.println("输入有误");
        }

        HashSet<Integer> hash  = new HashSet<>();
       for(int i : arr) {
           if (!hash.add(i)){
               System.out.println(i);
           }
       }
       }
    }

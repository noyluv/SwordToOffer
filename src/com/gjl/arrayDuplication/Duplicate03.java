/**
 * Filename: Duplicate03
 * Author:
 * Date : 2019/1/6 17:08
 * Description :
 */
package com.gjl.arrayDuplication;/*
 *用户 Administrator
 *编辑时间 2019/1/6
 *
 *不修改数组找出重复数字，借助辅助数组实现
 */

public class Duplicate03 {
    public void duplicate(int arr[],int n){//数组中数的大小范围是1~n
        if(arr == null || arr.length <0){
            System.out.println("输入有误");
        }
        for(int i : arr){
            if(arr[i]<0 || arr[i]>arr.length-1)
                System.out.println("输入有误");
        }

        int[] arr2 = new int[n+1];

        for(int i=0;i<arr.length;i++){
            if(arr2[arr[i]] != 0){
                System.out.println(arr[i]);
            }
            arr2[arr[i]] = arr[i];
        }
    }
}

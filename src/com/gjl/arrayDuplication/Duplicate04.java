/**
 * Filename: Duplicate04
 * Author:
 * Date : 2019/1/6 19:28
 * Description :
 */
package com.gjl.arrayDuplication;/*
 *用户 Administrator
 *编辑时间 2019/1/6
 *
 *
 */

public class Duplicate04 {
    public static void duplicate(int[] a,int n){//n表示数组中数的大小范围是1到n
        int start = 1;
        int end = n;
        while (start<=end){
            int mid = start+(end-start)/2;
            int count = countRange(a,a.length,start,mid);
            if (start==end){
                if (count>1){
                    System.out.println("找到重复元素："+start);
                    break;
                }
                else break;
            }
            if (count>(mid-start+1))
                end=mid;
            else start = mid+1;
        }
    }
    private static int countRange(int[] a,int length,int start,int end){
        int count=0;
        for (int i=0;i<a.length;i++){
            if (a[i]>=start&&a[i]<=end)count++;
        }
        return count;
    }
}

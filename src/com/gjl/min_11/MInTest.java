/**
 * Filename: MInTest
 * Author: gjl
 * Date : 2019/1/9 15:06
 * Description :
 */
package com.gjl.min_11;/*
 *用户 Administrator
 *编辑时间 2019/1/9
 *
 *
 */

public class MInTest {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int[] arr2 = {1,1,0,1,1,1,1};
        int[] arr3 = {3};
        Min mm = new Min();
        int a = mm.min(arr3);
        System.out.println(a);
    }
}

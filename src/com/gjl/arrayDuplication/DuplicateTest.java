
/**
 * Filename: DuplicateTest
 * Author: Jianlei Guo
 * Date : 2019/1/6 16:49
 * Description :
 */

package com.gjl.arrayDuplication;/*
 *用户 Administrator
 *编辑时间 2019/1/6
 *
 *
 */

public class DuplicateTest {
    public static void main(String[] args) {
        int[] a = {3,1,2,0,2,5,3};
        int[] b = {2,3,5,4,3,2,6,7};
//        Duplicate dd = new Duplicate();
//        dd.duplicate(a);
        Duplicate04 dd = new Duplicate04();
        dd.duplicate(b,8);

    }
}

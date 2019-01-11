/**
 * Filename: ReorderOddEvent
 * Author: gjl
 * Date : 2019/1/11 16:25
 * Description :
 */
package com.gjl.q_21_reorderOddEvent;/*
 *用户 Administrator
 *编辑时间 2019/1/11
 *
 *调整整数数组顺序，使奇数位于偶数的前面
 */

public class ReorderOddEvent {

    public int[]  orederOdd(int[] arr) {

        if (arr == null || arr.length <= 1)
            throw new RuntimeException("输入有误");

        int stindex = 0;
        int enindex = arr.length - 1;

        while (enindex > stindex) {
            while (stindex < enindex && arr[stindex] % 2 != 0)
                stindex++;
            while (stindex < enindex && arr[enindex] % 2 != 1)
                enindex--;
            if (stindex < enindex) {
                int temp = arr[stindex];
                arr[stindex] = arr[enindex];
                arr[enindex] = temp;

            }
        }
        return arr;
    }


}

/**
 * Filename: Duplicate
 * Author: gjl
 * Date : 2019/1/6 16:32
 * Description :
 */
package com.gjl.arrayDuplication;/*
 *用户 Administrator
 *编辑时间 2019/1/6
 *
 *找出数组中重复的数字——重排数组解法
 */

public class Duplicate {
    public boolean duplicate(int[] numbers) {


        if (numbers == null || numbers.length < 0) {
            return false;
        }
        for (int i : numbers) {
            if (numbers[i] < 0 || numbers[i] > numbers.length - 1) {
                return false;
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            while (numbers[j] != j) {
                if (numbers[j] == numbers[numbers[j]]) {
                    System.out.println(numbers[j]);
                    break;
                }
                int temp = numbers[j];
                numbers[j] = numbers[temp];
                numbers[temp] = temp;
            }
        }
        return false;
    }

}
/**
 * Filename: Findint
 * Author: gjl
 * Date : 2019/1/7 14:55
 * Description :
 */
package com.gjl.twoArray04;/*
 *用户 Administrator
 *编辑时间 2019/1/7
 *
 *二维数组中查找整数
 */

public class Findint {
    public void findint(int[][] arr ,int number){
        int m = arr.length;
        int n= arr[m-1].length;
        if(number < arr[0][0] || number > arr[m-1][n-1] || (Integer)number ==null){
            System.out.println("你要查找的值不在数组范围内");
        }
        if(arr!= null && m >0 && n>0){
            int row = 0;
            int column = n -1;
            while(row < m && column < n){
                if (arr[row][column] == number){

                    System.out.println("找到,在array["+ row + "][" + column+  "]");
                    break;
                } else if(arr[row][column] > number){
                    column-- ;
                }else{
                    row++ ;
                }

                }
            }
        }
    }


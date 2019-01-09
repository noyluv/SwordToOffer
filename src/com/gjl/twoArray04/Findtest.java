/**
 * Filename: Findtest
 * Author: gjl
 * Date : 2019/1/7 15:11
 * Description :
 */
package com.gjl.twoArray04;/*
 *用户 Administrator
 *编辑时间 2019/1/7
 *
 *
 */

public class Findtest {
    public static void main(String[] args) {

        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        for(int i=0;i< array.length;i++){
            System.out.println();
           for(int j=0;j<array[i].length;j++)
               System.out.print(array[i][j]+ " ");
        }

        Findint f = new Findint();
        f.findint(array,13);

    }
}

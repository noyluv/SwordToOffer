/**
 * Filename: Test
 * Author: gjl
 * Date : 2019/1/9 18:15
 * Description :
 */
package com.gjl.roadInMtrix_12;/*
 *用户 Administrator
 *编辑时间 2019/1/9
 *
 *
 */

public class Test {
    public static void main(String[] args) {

        char matrix[][] =new char[3][4];
        char ch1[] = { 'a', 'b', 'c', 'd' };
        char ch2[] = { 'b', 'c', 'd', 'a' };
        char ch3[] = { 'c', 'd', 'a', 'b' };
        matrix[0] = ch1;
        matrix[2] = ch3;
        matrix[1] = ch2;
        char str[] = { 'a', 'b', 'c', 'd' };

        RoadInMatrix rr = new RoadInMatrix();
        boolean b =rr.hasPath(matrix, str);
        System.out.println(b);

 }


}

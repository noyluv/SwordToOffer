/**
 * Filename: Test
 * Author: gjl
 * Date : 2019/1/10 22:51
 * Description :
 */
package com.gjl.q_19_match;/*
 *用户 Administrator
 *编辑时间 2019/1/10
 *
 *
 */

public class Test {
    public static void main(String[] args) {
        Match mm = new Match();
        String s1 = "aaa";
        String s2 = "aa.a";
        String s3 = "ab*a";
        char[] ss1 = s1.toCharArray();
        char[] ss2 = s2.toCharArray();
        char[] ss3 = s3.toCharArray();

       boolean a =  mm.match(ss1,ss2);
        System.out.println(a);
    }
}

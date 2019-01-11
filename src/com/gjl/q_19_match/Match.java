/**
 * Filename: Match
 * Author: gjl
 * Date : 2019/1/10 20:28
 * Description :
 */
package com.gjl.q_19_match;/*
 *用户 Administrator
 *编辑时间 2019/1/10
 *
 *
 */

public class Match {

    public boolean match(char[] str, char[] pattern){
        if(str == null && pattern == null){
            return false;
        }

        return matchCore(str, 0,pattern,0);
    }

    public  boolean matchCore( char[] str ,int s ,char[] pattern,int p){

        if(str.length <=s && pattern.length<=p){//同时匹配完
            return true;
        }
        if(str.length>s && pattern.length <=p){//字符串没匹配完，模式匹配完了
            return false;
        }

        //当pattern的下一个字符是*的时候
        if(p+1 <pattern.length && pattern[p+1]== '*'){


               if (str[s] == pattern[p] || pattern[p] == '.') {
                   return matchCore(str, s + 1, pattern, p + 2)  //字符串移动一个字符，模式移动两个字符
                           ||matchCore(str,s+1,pattern,p)       //字符串移动一个字符，模式不动
                           ||matchCore(str,s,pattern,p+2); //模式上向后移动两个字符
               }else{
                   return matchCore(str,s,pattern,p+2);
               }

        }

        //当pattern的下一个字符不是*的时候
            if(s >=str.length ) {
                return false;
            }else{
                if(str[s] == pattern[p] || pattern[p]=='.'){
                return matchCore(str, s + 1, pattern, p + 1);
            }
        }
        return false;
    }
}

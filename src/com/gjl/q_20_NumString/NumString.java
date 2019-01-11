/**
 * Filename: NumString
 * Author: gjl
 * Date : 2019/1/11 10:49
 * Description :
 */
package com.gjl.q_20_NumString;/*
 *用户 Administrator
 *编辑时间 2019/1/11
 *
 *实现一个个函数用来判断字符串是否表示数值（包括整数和小数）。
 */

public class NumString {

    public boolean isNumeric(char[] str){
        int p = 0;
        boolean flag = false;
        if(str ==null || str.length ==1)
            return false;
        //第一位是符号位则跳过
        if(str[p]=='+' || str[p]=='-'){
            p++;
        }
        //判断整数部分A
       while(p < str.length) {
            //查看是否有'.',如果有直接跳出
           if(str[p] == '.'){
               p++;
               flag = true;
               break;
           }
           //查看是否有e|E，如果是，直接跳出，不移动下标，在接下来进行处理
           if (str[p] == 'e' || str[p] == 'E') break;

          if(str[p] >= '0'&& str[p] <='9'){
               p++;
                continue;
           }
           return false;
       }
        //判断小数部分B
       while(p < str.length){
           if(str[p]=='e'|| str[p]=='E'){
               p++;
               if(p>=str.length ||(flag && p<=2)) return false;
               break;
           }
           if(str[p]>='0' && str[p] <='9'){
               p++;
               continue;
           }
           return false;
       }
        //判断指数部分C
       if(p <str.length && (str[p] == '+'|| str[p] =='-')){
           p++;
       }

       while(p<str.length){
           if(str[p] >='0' && str[p]<='9'){
               p++;
               continue;
           }
           return false;
       }
       return true;
    }


}

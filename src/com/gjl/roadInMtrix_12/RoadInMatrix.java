/**
 * Filename: RoadInMatrix
 * Author: gjl
 * Date : 2019/1/9 15:59
 * Description :
 */
package com.gjl.roadInMtrix_12;/*
 *用户 Administrator
 *编辑时间 2019/1/9
 *
 *设计一个函数，判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵的任意一格开始。
 * 路径进入一个格子之后不能再次进入
 */

public class RoadInMatrix {


    public boolean hasPath(char[][] matrix,char[] str){

        //判断输入的条件是否正确
        if(matrix == null|| str==null ){
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        //将矩阵中的每一个位置的访问状态设置为false
        boolean visit[][] = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                visit[i][j] =false;
            }
        }

        int strVisitNum = 0;//记录数量
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(hasPathCore(matrix,str,visit,i,j,strVisitNum))
                   return true;
            }
        }
        return false;
   }

   public boolean hasPathCore(char[][] matrix,char[] str1,boolean[][] visit,int i ,int j,int strVisitNum) {

       if (strVisitNum == str1.length) {
            return true;
       }

       boolean hasPath = false;
       if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[i][j] == str1[strVisitNum]
               && visit[i][j] == false) { //如果找到匹配的字符
           visit[i][j] = true;
           strVisitNum++;
           //找到匹配的字符，继续找下一个
           hasPath = hasPathCore(matrix, str1, visit, i - 1, j, strVisitNum)
                   || hasPathCore(matrix, str1, visit, i + 1, j, strVisitNum)
                   || hasPathCore(matrix, str1, visit, i, j - 1, strVisitNum)
                   || hasPathCore(matrix, str1, visit, i, j + 1, strVisitNum);
           //如果不匹配，则退回到上一个字符
           if (!hasPath) {
               strVisitNum--;
               visit[i][j] = false;
           }

       }

       return hasPath;
   }



}

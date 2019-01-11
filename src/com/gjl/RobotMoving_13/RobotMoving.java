/**
 * Filename: RobotMoving
 * Author: 郭建磊
 * Date : 2019/1/9 18:53
 * Description : 回溯法的使用
 */
package com.gjl.RobotMoving_13;/*
 *用户 Administrator
 *编辑时间 2019/1/9
 *
 *
 */

public class RobotMoving {
    /**
     * 功能描述：
     * m 行n列的格子，限值为threshold
     *
     * @return :
     */
      public int movingCount(int threshold,int m,int n){

        if(threshold < 0 || m<=0 || n<=0){
            return 0;
        }
        //将所有格点的状态设置为未访问
        boolean visit[][] = new boolean[m][n];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n ; j++) {
                visit[i][j] = false;
            }
        }

        int count = movingCountCore(threshold,m,n,0,0,visit);

        return count;
    }

    public int movingCountCore(int threshold,int m,int n,int rows,int cols,boolean[][] visit){
          int count=0;
          if(check(threshold, m,n,rows,cols,visit)){

              visit[rows][cols] = true;
              count = 1+ movingCountCore(threshold, m,n,rows-1,cols,visit)
                      +movingCountCore(threshold, m,n,rows+1,cols,visit)
                      +movingCountCore(threshold, m,n,rows,cols-1,visit)
                      +movingCountCore(threshold, m,n,rows,cols+1,visit);

          }
          return count;
    }
    //判断机器人是否可以进入方格
    public boolean check(int threshold,int m,int n,int rows,int cols,boolean[][] visit){

          if(rows >=0 && rows<m && cols>=0 && cols <n && (getDigitSum(rows) + getDigitSum(cols)<=threshold)
                  && !visit[rows][cols]){
              return true;
          }
          return false;
    }

    public int getDigitSum(int number){
          int sum=0;
          while(number>0){  //不能等于0，会造成死循环
              sum = sum+ number % 10;
              number = number / 10;
          }
          return sum;
    }
}

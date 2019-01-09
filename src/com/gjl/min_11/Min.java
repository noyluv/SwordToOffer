/**
 * Filename: Min
 * Author:
 * Date : 2019/1/9 14:34
 * Description :
 */
package com.gjl.min_11;/*
 *用户 Administrator
 *编辑时间 2019/1/9
 *考察二分查找的能力
 *输入一个递增排序的数组的一个旋转，输出旋转数组的最小值
 */

public class Min {
    public int min(int arr[]){
        //判断输入的数组是否合法
        if(arr == null || arr.length<=0){
            throw new RuntimeException("No element");
        }

        int index1 = 0;     //数组的第一个位置
        int index2 = arr.length-1;  //数组的最后一个位置
        int indexMid = index1;      //数组的中间位置
        while(arr[index1]>=arr[index2]){
            if(index2- index1 ==1){
                indexMid =  index2;
                break;
            }
            indexMid = (index1+ index2)/2 ;

            //如果三个数都相等，则要进行顺序查找
            if(arr[index1] == arr[index2] && arr[index1] == arr[indexMid]){
                return minInOrder(arr,index1,index2);
            }

            if(arr[indexMid] >= arr[index1]){
                index1 = indexMid;
            }else if(arr[indexMid] <= arr[index2]){
                index2 = indexMid;
            }

        }
        return arr[index2];
    }

    public int minInOrder(int[] array,int ind1,int ind2){
        int result = array[ind1];
        for(int i=ind1+1;i<ind2;i++){
            if (result > array[i]) {
                result = array[i];
            }
        }
        return result;

    }
}

package com.tiger.sort;

/**
 * 简单选择排序，常用于取序列中最大最小的几个数时
 * 本例升序排序
 */
public class SimpleSelect {
    public void sort(int[] a){
       int len = a.length;
       for(int i =0;i<len;i++){
           int selVal = a[i];
           int pos = i;
           for(int j = i+1;j<len;j++){
               if(selVal>a[j]){
                   selVal = a[j];
                   pos = j;
               }
           }
           a[pos] = a[i];
           a[i]  = selVal;
       }
    }
}

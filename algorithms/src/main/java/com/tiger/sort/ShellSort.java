package com.tiger.sort;

/** 40 20 28
 * 对插入排序算法的一种优化，是针对插入排序中，假如n个值进行升序排列，前n-1个值都是有序的，某个最小值在最末的位置，那么需要对前n-1个值进行后移操作
 * 当n非常大时效率是非常低的。
 * 希尔排序首先以某个步长进行插入排序，然后步长逐渐减小直至减到1，进行一次完整的插入排序，此时数组已经基本有序，所以进行插入排序效率是比较高的
 */
public class ShellSort {
    public void sort(int[] a){
        int len = a.length;
        int step = len;
        while(step!=0){
            step = step/2;
            for(int i = 0;i<step;i++){
                for(int j = i+step;j<len;j+=step){
                    int val = a[j];
                    int pre = j-step;
                    while(pre>=0 && a[pre]>val){
                        a[pre+1] = a[pre];
                        pre -= step;
                    }
                    a[pre+step] = val;
                }
            }
        }
    }
}

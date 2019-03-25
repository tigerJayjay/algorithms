package com.tiger.sort;

/**
 * 堆排序 472
 * 1.将序列构建成大顶堆
 * 2.将根节点与最后一个节点交换，然后断开最后一个节点
 * 3.重复1，2步，直到所有节点断开
 */
public class HeapSort {
    public void sort(int[] a){
       int len = a.length;
       for(int i = 0;i<len;i++){
           buildMaxHeap(a,len-i);
           swap(a,0,len-i-1);
       }
    }
    public void swap(int[] a,int var1,int var2){
        a[var1] = a[var1]^a[var2];
        a[var2] = a[var1]^a[var2];
        a[var1] = a[var1]^a[var2];
    }

    public void buildMaxHeap(int a[],int len){
        for(int i = len/2-1;i>=0;i--){
            ajustMax(a,i,len);
        }
    }

    public void ajustMax(int[] a,int var1,int len){
        int temp = a[var1];
        int index = var1;
        if(var1*2+1<len && a[var1*2+1]>temp){
            temp = a[var1*2+1];
            index = var1*2+1;
        }
        if(var1*2+2<len && a[var1*2+2]>temp){
            temp = a[var1*2+2];
            index = var1*2+2;
        }
        if(index != var1){
            a[index] = a[var1];
            a[var1] = temp;
        }
    }
}

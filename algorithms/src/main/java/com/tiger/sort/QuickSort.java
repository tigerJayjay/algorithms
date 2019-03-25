package com.tiger.sort;

/**
 * 选择第一个数为p，小于p的数放在左边，大于p的数放在右边
 * 递归的将p左边和右边的数都按照第一步进行，直到不能递归
 */
public class QuickSort {
    public void sort(int[] a){
        quickSort(a,0,a.length-1);
    }

    public void quickSort(int[] a,int var1,int var2){

                int key = a[var1];
                int index = var1;
                int start = var1;
                int end = var2;
                while(start<end){
                        while(start<end && a[end]>=key){
                        end--;
                    }
                    if(start<end && a[end]<key){
                        a[index] = a[end];
                        index = end;
                    }

                    while(start<end && a[start]<=key){
                        start++;
                    }
                    if(start<end && a[start]>key){
                        a[index] = a[start];
                        index = start;
                    }
                    a[index] = key;
                }
                if(index-1>=var1){
                    quickSort(a,var1,index-1);
                }
                if(index+1<=var2){
                    quickSort(a,index+1,var2);
                }

        }

}

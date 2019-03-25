package com.tiger.sort;

public class Bubble {
    public void sort(int[] a){
        int len = a.length;
        for(int i = 1;i<len;i++){
            for(int j = 0;j<len-i;j++){
                if(a[j+1]<a[j]){
                    a[j] = a[j+1]^a[j];
                    a[j+1] = a[j+1]^a[j];
                    a[j] = a[j+1]^a[j];
                }
            }
        }
    }
}

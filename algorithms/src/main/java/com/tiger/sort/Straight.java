package com.tiger.sort;

 /**147 151
 *  * 直接插入排序，在要排序的一组数中，假设前面(n-1)[n>=2]个数已经是排好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数也是排好顺序的，直到全部排好顺序。
 */
public class Straight {
    public void sort(int[] a){
        int len = a.length;
        for(int i = 0;i<len;i++){
            int val = a[i];
            int pre = i-1;
            while(pre>=0 && a[pre]>val){
                a[pre+1] = a[pre];
                pre--;
            }
            a[pre+1] = val;
        }
    }
}

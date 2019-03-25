package com.tiger.sort;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static  void  main(String[] args){
        //18
        Bubble b = new Bubble();
        QuickSort s = new QuickSort();
        int[] a = new int[100000000];
        for(int i = 0;i<100000000;i++){
            Random r = new Random();
            int t = r.nextInt(1000000);
            a[i] = t;
        }
        int[] bArray = Arrays.copyOf(a,a.length);
        int[] cArray = Arrays.copyOf(a,a.length);
        //b.sort(bArray);
        long start = System.currentTimeMillis();
        s.sort(bArray);
        System.out.println(System.currentTimeMillis()-start);

     /*  for(int j = 0;j<100000;j++){
            if(a[j] != bArray[j]){
                System.out.println("false");
                break;
            }
        }*/
        //Print.print(a);
    }
}

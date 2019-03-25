package com.tiger.leetcode;


public class Rsq_303{
    public static  void main(String[] args){
        NumArray t = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(t.sumRange(2,5));
    }
}

class NumArray {
    private int[] nums;

    public NumArray(int[] nums) {
        for(int i = 1;i < nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if(i == 0) return nums[j];
        return nums[j] - nums[i];
    }
}

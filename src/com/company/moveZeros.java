package com.company;

public class moveZeros {
    public static void moveZeroes(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]==0 && i< nums.length-counter){
                counter++;
                for (int j = i; j <nums.length-1 ; j++) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}

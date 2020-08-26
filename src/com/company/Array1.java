package com.company;

public class Array1 {

    public static int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1]!=nums[i]){
                counter++;
                nums[counter] = nums[i+1];


            }
        }
        return counter+1;
    }
}

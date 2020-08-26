package com.company;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int properK = k % nums.length;
        for (int i = 0; i < properK; i++) {
            int limit = nums.length-properK-1+i;
            while (limit>=i){
                int temp = nums[limit];
                nums[limit] = nums[limit+1];
                nums[limit+1] = temp;
                limit--;
            }
        }
    }
}

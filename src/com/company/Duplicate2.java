package com.company;

import java.util.Arrays;

public class Duplicate2 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}

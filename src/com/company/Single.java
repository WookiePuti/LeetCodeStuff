package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Single {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length==1){
            return nums[0];
        }
        for (int i = 0; i < nums.length ; i++) {
            if (i==0){
                if (nums[i+1]!=nums[i]){
                    return nums[i];
                }
            }
            else if(i==nums.length-1){
                if (nums[nums.length-1]!=nums[nums.length-2]){
                    return nums[nums.length-1];
                }
            }
            else {
                if (nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static int singleNumberSecond(int[] nums) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        for (int value :
                nums) {
            integerHashMap.put(value, integerHashMap.getOrDefault(value, 0) + 1);
        }

        for (int key :
                integerHashMap.keySet()) {
            if (integerHashMap.get(key) == 1) {
                return key;
            }
        }
            return -1;
    }

}

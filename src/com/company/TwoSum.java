package com.company;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {

            if (numMap.containsKey(target-nums[i])){
                if (numMap.get(target-nums[i])!=i) return new int[] {i, numMap.get(target-nums[i])};

            }
        }

        return new int[] {0,0};

    }
}

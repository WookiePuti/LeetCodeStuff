package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int actualIndex = 0;
        int solIndex = 0;
//        int[] solArray = new int[Math.min(nums1.length, nums2.length)];
        ArrayList<Integer> tempArray = new ArrayList<>();
        if (nums1.length > nums2.length){
            for (int i = 0; i < nums2.length; i++) {
                for (int j = actualIndex; j < nums1.length ; j++) {
                    if (nums1[j]==nums2[i]){
//                        solArray[solIndex] = nums1[j];
                        tempArray.add(nums1[j]);
                        solIndex++;
                        actualIndex++;
                        break;
                    }
                }
            }
        }
        else{
            for (int i = 0; i < nums1.length; i++) {
                for (int j = actualIndex; j < nums2.length ; j++) {
                    if (nums1[i]==nums2[j]){
//                        solArray[solIndex] = nums2[j];
                        tempArray.add(nums2[j]);
                        solIndex++;
                        actualIndex++;
                        break;
                    }
                }
            }
        }
        int[] solArray = new int[tempArray.size()];
        for (int i = 0; i < tempArray.size(); i++) {
            solArray[i] = tempArray.get(i);
        }
        return solArray;

    }
}

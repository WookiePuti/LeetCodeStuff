package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Intersection2 {
    public static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> nums1Heat = new HashMap<>();
        List<Integer> tempArray = new ArrayList<Integer>();
        for (int num :
                nums1) {
            nums1Heat.put(num, nums1Heat.getOrDefault(num, 0) + 1);
        }

        for (int num :
                nums2) {
            if (nums1Heat.getOrDefault(num, 0)>0){
                tempArray.add(num);
                nums1Heat.put(num, nums1Heat.get(num)-1);
            }
        }

        int[] solArray = new int[tempArray.size()];

        for (int i = 0; i < tempArray.size(); i++) {
            solArray[i] = tempArray.get(i);
        }
        return solArray;
    }
}

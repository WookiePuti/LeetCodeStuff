package com.company;

public class PlusOne2 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] widerArray = new int[digits.length+1];
        widerArray[0] = 1;
        return widerArray;
    }
}

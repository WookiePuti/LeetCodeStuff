package com.company;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String numberAsString = "";
        for (int num :
                digits) {
            numberAsString += Integer.toString(num);
        }
        Long tempNum = Long.parseLong(numberAsString);
        tempNum++;
        numberAsString = tempNum.toString();
        int[] solArray = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            solArray[i] = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
        }
        return solArray;

    }
}

package com.company;

public class Atoi {
    public static int myAtoi(String str) {
        str = str.replaceAll("[^\\d-]", "");

        try {
            return Integer.parseInt(str);
        }catch (NumberFormatException e){
            if (str.charAt(0)=='-'){
                return Integer.MIN_VALUE;
            }
            else return Integer.MAX_VALUE;
        }
    }
}

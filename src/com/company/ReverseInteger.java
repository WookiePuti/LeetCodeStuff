package com.company;

public class ReverseInteger {
    public static int reverse(int x) {
        String tempX = String.valueOf(x);
        if (tempX.charAt(0)=='-'){
            tempX = tempX.substring(1);
            StringBuilder sb = new StringBuilder(tempX);
            sb.reverse();
            sb.insert(0, "-");
            tempX = sb.toString();

        }
        else{
            StringBuilder sb = new StringBuilder(tempX);
            sb.reverse();
            tempX = sb.toString();
        }

        try {
            return Integer.parseInt(tempX);
        }catch (NumberFormatException e){
            return 0;
        }
    }
}

package com.company;

public class Palindrom {
    public static boolean isPalindrome(String s) {
        int initLen = s.length();
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (s.equals("")) return true;
        if (s.length()<2) {
            if (s.length()==initLen) return true;
            return false;
        }
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
}

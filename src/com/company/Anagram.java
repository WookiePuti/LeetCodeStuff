package com.company;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;

        Map<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freqMap.put(s.charAt(i), freqMap.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (freqMap.getOrDefault(t.charAt(i), 0)==0) return false;
            freqMap.put(t.charAt(i), freqMap.getOrDefault(t.charAt(i), 0)-1);
        }
        return freqMap.values().stream().filter(value -> value>0).count() ==0;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)- 'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i]!=0) return false;
        }
        return true;
    }
}

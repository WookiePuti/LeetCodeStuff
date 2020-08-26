package com.company;

import java.util.HashMap;
import java.util.Map;

public class UniqueChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequency.get(s.charAt(i))==1) return i;
        }
        return -1;

    }
}

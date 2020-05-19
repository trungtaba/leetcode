import java.util.Arrays;
import java.util.HashMap;

//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3333/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s2 == null || s2.length() == 0) {
            return s2.equals(s1);
        }
        if (s1.length() > s2.length()) {
            return false;
        }
        
        Map<Character, Integer> s1map = charCount(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (mapCompare(s1map, charCount(s2.substring(i, i + s1.length())))) {
                return true;
            }
        }
        return false;
    }

    public Map<Character, Integer> charCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }
    
    public boolean mapCompare(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Character ch : map1.keySet()) {
            if (map1.get(ch) - map2.getOrDefault(ch, -1) != 0) {
                return false;
            }
        }
        return true;
    }
}
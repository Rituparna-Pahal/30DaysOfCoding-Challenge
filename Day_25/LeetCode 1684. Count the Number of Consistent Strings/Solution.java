//"https://leetcode.com/problems/count-the-number-of-consistent-strings/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words)); 
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<>();
        
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }
        
        int consistentCount = 0;
        
        for (String word : words) {
            boolean isConsistent = true;
            
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            
            if (isConsistent) {
                consistentCount++;
            }
        }
        
        return consistentCount;
    }
}

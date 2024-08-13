//"https://leetcode.com/problems/truncate-sentence/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant"; int k = 4;
        System.out.println(truncateSentence(s, k));
    }
    public static String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < k; i++) {
            if (i > 0) {
                result.append(" ");
            }
            result.append(words[i]);
        }
        
        return result.toString();
    }
}

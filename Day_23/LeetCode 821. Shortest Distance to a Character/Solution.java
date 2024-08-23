//"https://leetcode.com/problems/shortest-distance-to-a-character/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] result = shortestToChar(s, c);
        
        for (int distance : result) {
            System.out.print(distance + " ");
        }
        System.out.println();
    }
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] distances = new int[n];
        
        for (int i = 0; i < n; i++) {
            distances[i] = Integer.MAX_VALUE;
        }
        
        int prevIndex = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prevIndex = i;
            }
            if (prevIndex != -1) {
                distances[i] = i - prevIndex;
            }
        }
        
        prevIndex = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prevIndex = i;
            }
            if (prevIndex != -1) {
                distances[i] = Math.min(distances[i], prevIndex - i);
            }
        }
        
        return distances;
    }
}

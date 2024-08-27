//"https://leetcode.com/problems/divisor-game/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int n = 10; 
        System.out.println(divisorGame(n)); 
    }
    public static boolean divisorGame(int n) {
        if (n == 1) {
            return false;
        }

        boolean[] dp = new boolean[n + 1];
        
        dp[1] = false; 
        
        for (int i = 2; i <= n; i++) {
            for (int x = 1; x < i; x++) {
                if (i % x == 0 && !dp[i - x]) {
                    dp[i] = true;
                    break; 
                }
            }
        }
        
        return dp[n];
    }
}

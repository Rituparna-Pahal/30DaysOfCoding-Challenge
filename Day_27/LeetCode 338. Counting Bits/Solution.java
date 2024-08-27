//"https://leetcode.com/problems/counting-bits/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        int[] result = solution.countBits(n);
        for (int bitCount : result) {
            System.out.print(bitCount + " ");
        }
    }
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
}

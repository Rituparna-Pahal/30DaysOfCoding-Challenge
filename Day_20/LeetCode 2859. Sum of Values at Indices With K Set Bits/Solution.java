//"https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 10, 15, 20, 25); 
        int K = 2; 
        int result = sumIndicesWithKSetBits(nums, K);
        
        System.out.println("Sum of values at indices with " + K + " set bits: " + result);
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
 
         for (int i = 0; i < nums.size(); i++) {
             if (Integer.bitCount(i) == k) {
                 sum += nums.get(i);
             }
         }
 
         return sum;
     }
}

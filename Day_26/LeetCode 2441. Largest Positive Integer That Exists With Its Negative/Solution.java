//"https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, -1, -2, 3, -3};
        System.out.println(findLargestK(nums));  
    }
    public static int findMaxK(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        
        for (int num : nums) {
            numSet.add(num);
        }
        
        int largestK = -1;
        
        for (int num : numSet) {
            if (num > 0 && numSet.contains(-num)) {
                if (num > largestK) {
                    largestK = num;
                }
            }
        }
        
        return largestK;
    }
}

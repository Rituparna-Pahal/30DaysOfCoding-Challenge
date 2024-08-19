//"https://leetcode.com/problems/rearrange-array-elements-by-sign/description/"

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = solution.rearrangeArray(nums);
        System.out.println(java.util.Arrays.toString(result)); 
    }

    public int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        
        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }
        
        int n = nums.length;
        int[] result = new int[n];
        int posIndex = 0, negIndex = 0;
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = positives.get(posIndex++);
            } else {
                result[i] = negatives.get(negIndex++);
            }
        }
        
        return result;
    }
}

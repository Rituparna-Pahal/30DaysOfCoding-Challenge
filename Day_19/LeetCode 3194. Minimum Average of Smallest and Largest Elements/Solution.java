//"https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/"

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 2, 4}; 
        System.out.println(solution.minimumAverage(nums)); 
    }
    
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); 
        
        double minAverage = Double.MAX_VALUE; 
        
        for (int i = 0; i < n / 2; i++) {
            int minElement = nums[i]; 
            int maxElement = nums[n - 1 - i];
            double average = (minElement + maxElement) / 2.0;
            minAverage = Math.min(minAverage, average); 
        }
        
        return minAverage; 
    }
}
    
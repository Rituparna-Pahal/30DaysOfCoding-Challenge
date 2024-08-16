//"https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/"

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1, 2, 3, 4, 5);
        int target = 7;
        
        Solution solution = new Solution();
        int result = solution.countPairs(nums, target);
        
        System.out.println("Number of pairs with sum less than " + target + ": " + result);
    }

    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
    
        int left = 0;
        int right = nums.size() - 1;
        int count = 0;

            while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            
            if (sum < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}

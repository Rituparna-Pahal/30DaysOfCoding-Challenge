//"https://leetcode.com/problems/maximum-number-of-pairs-in-array/description/"

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3,2,2};
        System.out.println(Arrays.toString(numberOfPairs(arr)));
    }
    public static int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        
        int pairs = 0;
        int leftovers = 0;
        int i = 0;
        
        while (i < nums.length) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                pairs++;
                i += 2; 
            } else {
                leftovers++;
                i++; 
            }
        }
        return new int[]{pairs, leftovers};
    }
}

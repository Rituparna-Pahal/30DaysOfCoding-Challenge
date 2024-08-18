//"https://leetcode.com/problems/neither-minimum-nor-maximum/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2};
        int result = findNonMinOrMax(nums);
        System.out.println(result);
    }
    public static int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        for (int num : nums) {
            if (num != min && num != max) {
                return num;
            }
        }
        return -1;
    }
    
}

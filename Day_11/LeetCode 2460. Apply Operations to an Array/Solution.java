//"https://leetcode.com/problems/apply-operations-to-an-array/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args){
        int[] arr={1,2,2,1,1,0};
        System.out.println(Arrays.toString(applyOperations(arr)));
    }
    public static int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }
        while (nonZeroIndex < n) {
            nums[nonZeroIndex++] = 0;
        }
        return nums;
    }
}

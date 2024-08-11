//"https://leetcode.com/problems/move-zeroes/description//"

import java.util.*;
public class Solution {
    public static void main(String[] args){
        int[] arr={0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                int temp = nums[current];
                nums[current] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
                lastNonZeroIndex++;
            }
        }
    }
}
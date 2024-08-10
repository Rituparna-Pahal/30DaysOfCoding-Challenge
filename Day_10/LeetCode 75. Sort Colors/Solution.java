//"https://leetcode.com/problems/sort-colors/description/"

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr={1,0,2,1,0,0,2};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {
        int start = 0;               
        int end = nums.length - 1;
        int i = 0;

        while (i <= end) {
            if (nums[i] == 0) {
                swap(nums, i, start);
                start++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else { 
                swap(nums, i, end);
                end--;
            }
        }
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

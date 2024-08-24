//"https://leetcode.com/problems/find-target-indices-after-sorting-array/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3, 2};
        int target = 2;
        List<Integer> result = findTargetIndices(nums, target);
        System.out.println(result); 
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        int leftBound = findLeftBound(nums, target);
        int rightBound = findRightBound(nums, target);

        List<Integer> targetIndices = new ArrayList<>();
        for (int i = leftBound; i < rightBound; i++) {
            targetIndices.add(i);
        }

        return targetIndices;
    }
    public static int findLeftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static int findRightBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}

//"https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/"

public class Solution {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        System.out.println(findMin(arr));
    }
        public static int findMin(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
    
            if (nums[start] < nums[end]) {
                return nums[start];
            }
    
            while (start < end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] > nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return nums[start];
        }
    }

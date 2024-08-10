//"https://leetcode.com/problems/search-in-rotated-sorted-array/description/"

public class Solution {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=2;
        System.out.println(search(arr, target));
    }
    public static int search(int[] nums, int target) {
        int s=0; int e=nums.length-1;int index=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                index=mid;
                return index;
            }
            if (nums[s] <= nums[mid]) {
                if (nums[s] <= target && target < nums[mid]) {
                    e = mid - 1; 
                } else {
                    s = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
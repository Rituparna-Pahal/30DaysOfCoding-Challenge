//"https://leetcode.com/problems/left-and-right-sum-differences/"

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr={10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(arr)));
    }
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] answer = new int[n];
        int currentLeftSum = 0;

        for (int i = 0; i < n; i++) {
            leftSum[i] = currentLeftSum;
            currentLeftSum += nums[i];
        }
        int currentRightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightSum[i] = currentRightSum;
            currentRightSum += nums[i];
        }
        for (int i = 0; i < n; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
    
}

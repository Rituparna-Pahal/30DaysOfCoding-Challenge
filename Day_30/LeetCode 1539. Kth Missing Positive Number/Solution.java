//"https://leetcode.com/problems/kth-missing-positive-number/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        System.out.println("Test Case 1: " + findKthPositive(arr1, k1)); 
    }
    public static int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int expectedValue = mid + 1;
            int actualValue = arr[mid];

            if (actualValue - expectedValue >= k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left + k;
    }
}

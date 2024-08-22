//"https://leetcode.com/problems/sum-of-all-odd-length-subarrays/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int result = sumOddLengthSubarrays(arr);
        System.out.println("Sum of all odd length subarrays: " + result); 
    } 
    public static int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int totalSubarraysIncludingI = (i + 1) * (n - i);
            int countOddLengthSubarrays = (totalSubarraysIncludingI + 1) / 2;
            totalSum += arr[i] * countOddLengthSubarrays;
        }

        return totalSum;
    }
}

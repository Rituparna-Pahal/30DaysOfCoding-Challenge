//"https://leetcode.com/problems/pancake-sorting/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
            int[] arr = {3, 2, 4, 1};
            List<Integer> flips = pancakeSort(arr);
            
            System.out.println("Sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            
            System.out.println("Flip operations: " + flips);
    }
    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        for (int curr_size = n; curr_size > 1; curr_size--) {
            int maxIndex = findMaxIndex(arr, curr_size);
            
            if (maxIndex != curr_size - 1) {
                if (maxIndex != 0) {
                    flip(arr, maxIndex + 1);
                    result.add(maxIndex + 1);
                }
                
                flip(arr, curr_size);
                result.add(curr_size);
            }
        }
        
        return result;
    }
    public static int findMaxIndex(int[] arr, int n) {
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void flip(int[] arr, int k) {
        int start = 0;
        int end = k - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

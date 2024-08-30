//"https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        int k = 8;
        System.out.println("The " + k + "-th smallest element is: " + kthSmallest(matrix, k));
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (countLessEqual(matrix, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
    
    private static int countLessEqual(int[][] matrix, int x) {
        int count = 0;
        int n = matrix.length;
        int row = n - 1;
        int col = 0;
        
        while (row >= 0 && col < n) {
            if (matrix[row][col] <= x) {
                count += (row + 1);
                col++;
            } else {
                row--;
            }
        }
        
        return count;
    }
}

//"https://leetcode.com/problems/rotate-image/description/"

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},{4,5,6},{7,8,9}
        };
        rotate(arr);
        for(int i[] : arr){
            System.out.println(Arrays.toString(i));
        }
        
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }
    public static void reverse(int[] row) {
        int left = 0, right = row.length - 1;
        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;
            left++;
            right--;
        }
    }
}

//"https://leetcode.com/problems/set-matrix-zeroes/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 0, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
       int n = matrix[0].length;

       Set<Integer> zeroRows = new HashSet<>();
       Set<Integer> zeroCols = new HashSet<>();

       for (int i = 0; i < m; i++) {
           for (int j = 0; j < n; j++) {
               if (matrix[i][j] == 0) {
                   zeroRows.add(i);
                   zeroCols.add(j);
               }
           }
       }
       for (int row : zeroRows) {
           for (int j = 0; j < n; j++) {
               matrix[row][j] = 0;
           }
       }
       for (int col : zeroCols) {
           for (int i = 0; i < m; i++) {
               matrix[i][col] = 0;
           }
       }
   }
   private static void printMatrix(int[][] matrix) {
       for (int[] row : matrix) {
           for (int value : row) {
               System.out.print(value + " ");
           }
           System.out.println();
       }
   }
}

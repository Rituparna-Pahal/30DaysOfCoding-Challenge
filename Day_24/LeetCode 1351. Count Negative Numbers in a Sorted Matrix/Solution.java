//"https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/"

public class Solution {
    public static void main(String[] args) {
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };

        System.out.println("Number of negative numbers: " + countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int row = 0; row < m; row++) {
            int firstNegativeIndex = findFirstNegativeIndex(grid[row]);
            count += (n - firstNegativeIndex);
        }

        return count;
    }
    public static int findFirstNegativeIndex(int[] row) {
        int left = 0;
        int right = row.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (row[mid] < 0) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }
        
        return left; 
    }
}

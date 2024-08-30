//"https://leetcode.com/problems/kth-smallest-number-in-multiplication-table/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int m = 3, n = 3, k = 5;
        System.out.println("The " + k + "-th smallest number in the multiplication table is: " + findKthSmallest(m, n, k));
    }
    public static int findKthNumber(int m, int n, int k) {
        int low = 1;
        int high = m * n;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (countLessEqual(m, n, mid) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
    
    private static int countLessEqual(int m, int n, int x) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(n, x / i);
        }
        return count;
    }
}

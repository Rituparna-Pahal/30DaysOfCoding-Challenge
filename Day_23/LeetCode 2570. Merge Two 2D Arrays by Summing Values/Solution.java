//"https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[][] nums1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] nums2 = {{1, 3}, {2, 5}, {5, 1}};
        
        int[][] result = mergeArrays(nums1, nums2);
        
        for (int[] entry : result) {
            System.out.println(Arrays.toString(entry));
        }
    }
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] a : nums1) {
            map.put(a[0], a[1]);
        }
        for (int[] a : nums2) {
            if (map.containsKey(a[0])) {
                map.put(a[0], map.get(a[0]) + a[1]);
            } else {
                map.put(a[0], a[1]);
            }
        }
        int[][] ans = new int[map.size()][2];
        int i = 0;
        for (int key : map.keySet()) {
            ans[i++] = new int[]{key, map.get(key)};
        }
        Arrays.sort(ans, (a, b) -> a[0] - b[0]);
        return ans;
    }
}

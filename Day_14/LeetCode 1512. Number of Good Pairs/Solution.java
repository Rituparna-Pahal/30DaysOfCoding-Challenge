//"https://leetcode.com/problems/number-of-good-pairs/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int totalPairs = 0;

        for (int num : nums) {
            if (countMap.containsKey(num)) {
                totalPairs += countMap.get(num);
            }
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        return totalPairs;
    }
    
}

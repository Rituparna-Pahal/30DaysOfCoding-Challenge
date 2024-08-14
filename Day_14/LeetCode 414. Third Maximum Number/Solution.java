//"https://leetcode.com/problems/third-maximum-number/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst(); 
            }
        }
                if (set.size() == 3) {
            return set.first(); 
        } else {
            return set.last(); 
        }
    }
}

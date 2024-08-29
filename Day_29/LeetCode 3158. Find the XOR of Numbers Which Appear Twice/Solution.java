//"https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int result = findXOR(nums);
        System.out.println("XOR of numbers that appear twice: " + result);
    }
    public static int findXOR(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int xor = 0;
        for (int num : nums) {
            if (seen.contains(num)) {
                xor ^= num;
            } else {
                seen.add(num);
            }
        }
        return xor;
    }
}

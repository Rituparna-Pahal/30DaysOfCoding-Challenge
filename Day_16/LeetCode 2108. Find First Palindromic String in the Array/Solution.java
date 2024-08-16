//"https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/"

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "car", "ada", "racecar", "cool");
        String result = Solution.firstPalindrome(strings);
        System.out.println("First palindromic string: " + result);
    }

    public static String firstPalindrome(List<String> words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
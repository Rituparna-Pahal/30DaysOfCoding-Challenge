//"https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int n = 3; 
        List<String> binaryStrings = validStrings(n);
        
        System.out.println("Binary strings of length " + n + " without adjacent zeros:");
        for (String s : binaryStrings) {
            System.out.println(s);
        }
    }  
    public static List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generateStrings("", n, result);
        return result;
    }
    public static void generateStrings(String current, int n, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }

        generateStrings(current + "1", n, result);

        if (current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            generateStrings(current + "0", n, result);
        }
    }
}

//"https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/"

public class Solution {
    public static void main(String[] args) {
        int[] pref = {1, 2, 3}; 
        int[] originalArray = findArray(pref);
        
        System.out.println("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] findArray(int[] pref) {
        int n = pref.length;
         if (n == 0) {
             return new int[0]; 
         }
 
         int[] arr = new int[n];
         arr[0] = pref[0];
 
         for (int i = 1; i < n; i++) {
             arr[i] = pref[i] ^ pref[i - 1];
         }
 
         return arr; 
     }
}

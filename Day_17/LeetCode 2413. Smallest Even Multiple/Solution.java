//"https://leetcode.com/problems/smallest-even-multiple/description/"

public class Solution {
    public static void main(String[] args) {
        Solution sem = new Solution();
        System.out.println(sem.smallestEvenMultiple(3));  
        System.out.println(sem.smallestEvenMultiple(4)); 
        System.out.println(sem.smallestEvenMultiple(7));  
        System.out.println(sem.smallestEvenMultiple(10)); 
    }
    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
           return n; 
       } else {
           return 2 * n; 
       }
   }
    
}

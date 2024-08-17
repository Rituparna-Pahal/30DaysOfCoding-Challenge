//"https://leetcode.com/problems/reverse-integer/description/"

public class Solution {
    public static void main(String[] args) {
        Solution ri = new Solution();
        System.out.println(ri.reverse(123)); 
        System.out.println(ri.reverse(-123)); 
        System.out.println(ri.reverse(120)); 
        System.out.println(ri.reverse(1534236469));
    }
    public static int reverse(int x) {
        int reversed = 0;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0; 
            }
            
            reversed = reversed * 10 + digit;
        }
        
        return reversed * sign;
    }
    
}
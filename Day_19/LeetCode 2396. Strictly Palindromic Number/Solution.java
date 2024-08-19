//"https://leetcode.com/problems/strictly-palindromic-number/description/"

public class Solution {
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(3)); 
        System.out.println(isStrictlyPalindromic(4)); 
    }
    public static String toBase(int number, int base) {
        if (number == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            int digit = number % base;
            sb.append((char) (digit < 10 ? '0' + digit : 'a' + digit - 10));
            number /= base;
        }
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isStrictlyPalindromic(int n) {
        if (n <= 2) {
            return false;
        }
        for (int base = 2; base <= n - 2; base++) {
            String representation = toBase(n, base);
            if (!isPalindrome(representation)) {
                return false;
            }
        }
        return true;
    }
}

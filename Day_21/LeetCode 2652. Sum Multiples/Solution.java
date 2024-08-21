//"https://leetcode.com/problems/sum-multiples/"

public class Solution {
    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Sum of multiples of 3, 5, or 7 up to " + n + " is: " + sumMultiples(n));
    }
    public static int sumOfMultiples(int n) {
        return sumDivisibleBy(n, 3) +
               sumDivisibleBy(n, 5) +
               sumDivisibleBy(n, 7) -
               sumDivisibleBy(n, 15) -
               sumDivisibleBy(n, 21) -
               sumDivisibleBy(n, 35) +
               sumDivisibleBy(n, 105);
    }

    private static int sumDivisibleBy(int n, int d) {
        int k = n / d;  
        return d * k * (k + 1) / 2;  
    }
}

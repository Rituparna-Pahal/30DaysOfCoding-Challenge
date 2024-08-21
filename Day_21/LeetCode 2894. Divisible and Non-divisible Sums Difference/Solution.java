//"https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/"

class Solution {
    public static void main(String[] args) {
        int n = 10;
        int m = 3;
        System.out.println("The difference is: " + differenceOfSums(n, m));
    }
    public static int differenceOfSums(int n, int m) {
        int totalSum =  n * (n + 1) / 2;
        
        int k = n / m;
        
        int sumDivisibleByM =  m * k * (k + 1) / 2;
        
        int sumNotDivisibleByM = totalSum - sumDivisibleByM;
        
        int difference = sumNotDivisibleByM - sumDivisibleByM;
        
        return difference;
    }
}
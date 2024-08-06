//"https://leetcode.com/problems/fibonacci-number/description/"

public class Solution {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}

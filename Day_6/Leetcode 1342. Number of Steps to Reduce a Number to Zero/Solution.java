//"https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/"

public class Solution {
    public static void main(String[] args) {
        int n=56;
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    static int helper(int num, int c){
        if(num==0){
            return c;
        }
        if(num%2==0){
            return helper(num/2,c+1);
        }
        return helper(num-1, c+1);
    }
}

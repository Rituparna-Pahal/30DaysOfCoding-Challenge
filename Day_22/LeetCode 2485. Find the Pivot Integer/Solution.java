//"https://leetcode.com/problems/find-the-pivot-integer/"

public class Solution {
    public static void main(String[] args) {
        int n = 7;
        int pivot = pivotInteger(n);
        System.out.println("Pivot Integer: " + pivot); 
    }
    public static int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        int leftSum = 0;

        for (int x = 1; x <= n; x++) {
            leftSum += x; 
            
            int rightSum = totalSum - leftSum + x;

            if (leftSum == rightSum) {
                return x;
            }
        }
        return -1;
    }
}

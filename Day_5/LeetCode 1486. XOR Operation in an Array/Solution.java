//"https://leetcode.com/problems/xor-operation-in-an-array/"

public class Solution {
    public static void main(String[] args) {
        int n=4; int start=3;
        System.out.println(xorOperation(n, start));
    }
    public static int xorOperation(int n, int start) {
        int[] nums=new int[n]; int xor=0;
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
            xor ^=nums[i];
        }
        return xor;
    }
}

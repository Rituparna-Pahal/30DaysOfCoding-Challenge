//"https://leetcode.com/problems/max-consecutive-ones/description/"

public class Solution {
    
    public static void main(String[] args) {
        int[] arr={1,1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
        
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
    }
    return maxCount;
    }
}

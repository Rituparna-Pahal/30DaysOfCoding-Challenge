//"https://leetcode.com/problems/magnetic-force-between-two-balls/"

public class Solution {
    public static void main(String[] args) {
        int[] positions = {1, 2, 8, 4, 9};
        int m = 3;
        System.out.println("Maximum minimum magnetic force: " + maxMinForce(positions, m)); 
    }
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position); 
        
        int left = 0; 
        int right = position[position.length - 1] - position[0]; 
        int bestForce = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlaceBalls(position, m, mid)) {
                bestForce = mid; 
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return bestForce;
    }
    public static boolean canPlaceBalls(int[] positions, int m, int minForce) {
        int count = 1; 
        int lastPosition = positions[0]; 
        
        for (int i = 1; i < positions.length; i++) {
            if (positions[i] - lastPosition >= minForce) {
                count++;
                lastPosition = positions[i];
                if (count == m) {
                    return true;
                }
            }
        }
        return false;
    }
}

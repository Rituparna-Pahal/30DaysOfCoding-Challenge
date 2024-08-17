//"https://leetcode.com/problems/find-the-maximum-achievable-number/description/"

public class Solution {
    public static void main(String[] args) {
        Solution man = new Solution();
        System.out.println(man.theMaximumAchievableX(2769, 5)); 
        System.out.println(man.theMaximumAchievableX(100, 20)); 
        System.out.println(man.theMaximumAchievableX(-10, 10));
        System.out.println(man.theMaximumAchievableX(0, 0));
    }
    public static int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }
    
}

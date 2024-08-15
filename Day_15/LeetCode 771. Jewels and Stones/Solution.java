//"https://leetcode.com/problems/jewels-and-stones/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        int result = numJewelsInStones(J, S);
        System.out.println("Number of jewels in stones: " + result);
    }
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }
        int count = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                count++;
            }
        }

        return count;
    }
}

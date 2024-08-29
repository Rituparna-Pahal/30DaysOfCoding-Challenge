//"https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ab");
        words.add("ba");
        words.add("cd");
        words.add("dc");
        words.add("dd");

        int maxPairs =maximumNumberOfStringPairs(words);
        System.out.println("Maximum number of string pairs: " + maxPairs);
    }
    public static int maximumNumberOfStringPairs(List<String> words) {
        HashMap<String, Integer> count = new HashMap<>();
        int pairs = 0;
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (count.containsKey(reversed)) {
                pairs++;
                count.put(reversed, count.get(reversed) - 1);
                if (count.get(reversed) == 0) {
                    count.remove(reversed);
                }
            } else {
                count.put(word, count.getOrDefault(word,0) + 1);
            }
        }
        return pairs;
    }
}

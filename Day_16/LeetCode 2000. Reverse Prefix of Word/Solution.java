//"https://leetcode.com/problems/reverse-prefix-of-word/description/"

public class Solution {
    public static void main(String[] args) {
        String word = "abcdefd"; char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
                if (index == -1) {
            return word;
        }
        String prefix = word.substring(0, index + 1);
        String reversedPrefix = new StringBuilder(prefix).reverse().toString();
        String suffix = word.substring(index + 1);
        
        return reversedPrefix + suffix;
    }
}

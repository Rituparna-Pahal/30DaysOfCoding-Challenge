//"https://leetcode.com/problems/decode-the-message/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String key = "happy boy";
        String message = "h dyyh";
        System.out.println(decodeMessage(key, message)); 
    }
    public static String decodeMessage(String key, String message) {
        HashMap<Character, Character> substitutionTable = new HashMap<>();
        
        char currentChar = 'a';  
        
        for (char c : key.toCharArray()) {
            if (c != ' ' && !substitutionTable.containsKey(c)) {
                substitutionTable.put(c, currentChar);
                currentChar++; 
            }
        }
        
        StringBuilder decodedMessage = new StringBuilder();
        
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                decodedMessage.append(' ');
            } else {
                decodedMessage.append(substitutionTable.get(c));  
            }
        }
        
        return decodedMessage.toString();
    }
}

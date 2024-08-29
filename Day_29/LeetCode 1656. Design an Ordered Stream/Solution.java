//"https://leetcode.com/problems/design-an-ordered-stream/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int n = 5;
        OrderedStream stream = new OrderedStream(n);

        List<String> chunk1 = stream.insert(3, "ccccc");
        System.out.println("Chunk 1: " + chunk1);

        List<String> chunk2 = stream.insert(1, "aaaaa");
        System.out.println("Chunk 2: " + chunk2);

        List<String> chunk3 = stream.insert(2, "bbbbb");
        System.out.println("Chunk 3: " + chunk3);

        List<String> chunk4 = stream.insert(4, "dddd");
        System.out.println("Chunk 4: " + chunk4);

        List<String> chunk5 = stream.insert(5, "eeeee");
        System.out.println("Chunk 5: " + chunk5);
    }
    private static String[] values;
    private static int ptr;
    public static OrderedStream(int n) {
        values = new String[n];
        ptr = 0;
    }
    
    public static List<String> insert(int idKey, String value) {
        values[idKey - 1] = value;
        List<String> output = new ArrayList<>();
        while (ptr < values.length && values[ptr] != null) {
            output.add(values[ptr]);
            ptr++;
        }
        return output;
    }
}

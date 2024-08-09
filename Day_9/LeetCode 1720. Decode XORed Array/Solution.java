//"https://leetcode.com/problems/decode-xored-array/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int[] arr={6,2,7,3};
        int first=4;
        System.out.println(Arrays.toString(decode(arr, first)));
    }
    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] decoded = new int[n];
        decoded[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            decoded[i + 1] = decoded[i] ^ encoded[i];
        }

        return decoded;
    }
}

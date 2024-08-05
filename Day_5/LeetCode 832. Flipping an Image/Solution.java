//"https://leetcode.com/problems/flipping-an-image/"

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[][] image={{1,0,1},{0,1,0},{0,0,0}};
        
        int[][] result = flipAndInvertImage(image);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int start=0; int end=image.length-1;
            while(start<=end){
                int temp=image[i][start]^1;
                image[i][start]=image[i][end]^1;
                image[i][end]=temp;
                start++;
                end--;
            }
        }
        return image;
    }
}

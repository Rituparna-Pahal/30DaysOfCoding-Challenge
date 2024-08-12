//"https://leetcode.com/problems/sort-an-array/description/"

import java.util.Arrays;

public class Solution {
   public static void main(String[] args){
    int[] arr={5,4,3,2,1};
    System.out.println(Arrays.toString(sortArray(arr)));
   } 
   public static int[] sortArray(int[] nums) {
    if(nums.length==1){
        return nums;
    }
    int mid=nums.length/2;
    int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
    int[] right=sortArray(Arrays.copyOfRange(nums,mid,nums.length));

    return merge(left,right);
}
public static int[] merge(int[] first, int[] second){
    int i=0;
    int j=0;
    int k=0;
    int[] mix=new int[first.length+second.length];
    while(i<first.length && j<second.length){
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
        } else {
            mix[k]=second[j];
            j++;
        }
        k++;
    }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
    return mix;
}
}

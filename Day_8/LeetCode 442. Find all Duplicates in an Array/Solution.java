//"https://leetcode.com/problems/find-all-duplicates-in-an-array/"

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,6,7,3};
        System.out.println(findDuplicates(arr));
    }
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        int i=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            } else {
               i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

     public static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

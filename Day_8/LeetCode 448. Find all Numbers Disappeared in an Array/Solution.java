//"https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/"

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] arr={1,2,3,3};
        System.out.println(findDisappearedNumbers(arr));
        
    }
        public static ArrayList<Integer> findDisappearedNumbers(int[] arr) {
            int i=0;
            while(i<arr.length){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
            ArrayList<Integer> ans=new ArrayList<>();
            for(int index=0; index<arr.length; index++){
                if(arr[index]!=(index+1)){
                    ans.add(index+1);
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

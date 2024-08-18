//"https://leetcode.com/problems/sort-the-students-by-their-kth-score/description/"

import java.util.*;
public class Solution {
    public static void main(String[] args){
        int[][] scores = {
            {1, 90},
            {2, 85},
            {3, 95}
        };
        int k = 1; 
        
        int[][] sortedScores = sortTheStudents(scores, k);
        for (int[] row : sortedScores) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] sortTheStudents(int[][] score, int k) {
        quickSort(score, 0, score.length - 1, k);
        return score;
    }

    private static void quickSort(int[][] score, int low, int high, int k) {
        if (low < high) {
            int pi = partition(score, low, high, k);
            quickSort(score, low, pi - 1, k);
            quickSort(score, pi + 1, high, k);
        }
    }

    private static int partition(int[][] score, int low, int high, int k) {
        int pivot = score[high][k]; 
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            if (score[j][k] > pivot) { 
                i++;
                swap(score, i, j);
            }
        }
        swap(score, i + 1, high);
        return i + 1;
    }

    private static void swap(int[][] score, int i, int j) {
        int[] temp = score[i];
        score[i] = score[j];
        score[j] = temp;
    }
    
}

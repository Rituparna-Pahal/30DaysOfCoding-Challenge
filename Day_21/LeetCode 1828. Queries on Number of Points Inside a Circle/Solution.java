//"https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/description/"

public class Solution {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {3, 3}, {5, 3}, {2, 2}};
        int[][] queries = {{3, 3, 2}, {4, 4, 1}, {1, 1, 2}};

        int[] answer = countPoints(points, queries);

        System.out.println("Number of points inside each circle:");
        for (int count : answer) {
            System.out.println(count);
        }
    }
    public static int[] countPoints(int[][] points, int[][] queries) {
        int numQueries = queries.length;
        int[] result = new int[numQueries];

        for (int i = 0; i < numQueries; i++) {
            int count = 0;
            int cx = queries[i][0]; 
            int cy = queries[i][1]; 
            int r = queries[i][2]; 

            for (int[] point : points) {
                int px = point[0]; 
                int py = point[1]; 

                int dx = px - cx;
                int dy = py - cy;
                if (dx * dx + dy * dy <= r * r) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
}

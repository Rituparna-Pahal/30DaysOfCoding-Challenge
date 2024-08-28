//"https://leetcode.com/problems/range-sum-of-bst/"

import java.util.*;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10,
                          new TreeNode(5,
                              new TreeNode(3),
                              new TreeNode(7)),
                          new TreeNode(15,
                              null,
                              new TreeNode(18)));

        int low = 7;
        int high = 15;


        int result = solution.rangeSumBST(root, low, high);

        System.out.println("The sum of values in the range [" + low + ", " + high + "] is: " + result);
    }
    public static int rangeSumBST(TreeNode root, int low, int high) {
        return rangeSumBSTHelper(root, low, high);
   }

   private static int rangeSumBSTHelper(TreeNode node, int low, int high) {
       if (node == null) {
           return 0;
       }
       
       int sum = 0;
       
       if (node.val >= low && node.val <= high) {
           sum += node.val;
       }
       
       if (node.val > low) {
           sum += rangeSumBSTHelper(node.left, low, high);
       }
       
       if (node.val < high) {
           sum += rangeSumBSTHelper(node.right, low, high);
       }
       
       return sum;
   }
}

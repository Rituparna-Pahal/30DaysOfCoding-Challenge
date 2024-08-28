//"https://leetcode.com/problems/root-equals-sum-of-children/description/"

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
                          new TreeNode(4),
                          new TreeNode(6));

        boolean result = checkTree(root);

        System.out.println("Does the root value equal the sum of its children? " + result);
    }
    public static boolean checkTree(TreeNode root) {
        if (root == null || root.left == null || root.right == null) {
            return false; 
        }
        
        int sum = root.left.val + root.right.val;
        
        return root.val == sum;
    }
}

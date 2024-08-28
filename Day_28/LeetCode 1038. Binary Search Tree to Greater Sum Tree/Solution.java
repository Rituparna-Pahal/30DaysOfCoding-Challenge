//"https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/"

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
        TreeNode root = new TreeNode(4,
                          new TreeNode(1,
                              null,
                              new TreeNode(2)),
                          new TreeNode(6,
                              new TreeNode(5),
                              new TreeNode(7, null, new TreeNode(8))));

        System.out.println("BST before conversion:");
        printInOrder(root);
        System.out.println();

        root = solution.bstToGst(root);

        System.out.println("GST after conversion:");
        printInOrder(root);
    }
    private static int runningSum = 0; 

    public static TreeNode bstToGst(TreeNode root) {
        reverseInOrderTraversal(root);
        return root;
    }

    private static void reverseInOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        
        reverseInOrderTraversal(node.right);
        
        runningSum += node.val;
        node.val = runningSum;
        
        reverseInOrderTraversal(node.left);
    }
}

//"https://leetcode.com/problems/all-possible-full-binary-trees/description/"

import java.util.*;
public class Solution {
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
    public static void main(String[] args) {
        List<TreeNode> trees = allPossibleFBT(5);
        TreePrinter.printTrees(trees);
    }
    public static List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) {
            return new ArrayList<>();
        }
        return allPossibleFBTHelper(n);
    }
    private static List<TreeNode> allPossibleFBTHelper(int n) {
        List<TreeNode> result = new ArrayList<>();
        if (n == 1) {
            result.add(new TreeNode(0));
            return result;
        }

        for (int leftNodes = 1; leftNodes < n; leftNodes += 2) {
            int rightNodes = n - 1 - leftNodes;
            List<TreeNode> leftTrees = allPossibleFBTHelper(leftNodes);
            List<TreeNode> rightTrees = allPossibleFBTHelper(rightNodes);

            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }

        return result;
    }
}

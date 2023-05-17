/*
226. Invert Binary Tree
Link: https://leetcode.com/problems/invert-binary-tree/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/
/**
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = temp;
        }
        return root;
    }
}
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
      public int height(TreeNode root) {
        if(root==null){
            return 0;
        }
   int left=height(root.left);
   int right=height(root.right);
   int myheight=Math.max(left,right)+1;
   return myheight;}
 public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=diameterOfBinaryTree(root.left);
        int right=diameterOfBinaryTree(root.right);
        int diameter1=height(root.left)+height(root.right);
        return Math.max(diameter1,Math.max(left,right));
    }
}

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
    int accSum=0;
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }
    private void traverse(TreeNode node){
        if(node == null)
            return;
        
        if(node.right!=null)
            traverse(node.right);
        accSum+= node.val;
        node.val =accSum;

        if(node.left!=null)
            traverse(node.left);
        
    }
}

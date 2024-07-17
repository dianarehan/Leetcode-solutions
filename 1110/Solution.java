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
    HashSet<Integer> delNodes=new HashSet<>();
    ArrayList<TreeNode> res= new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int i = 0;i<to_delete.length;i++){
            delNodes.add(to_delete[i]);
        }
        helper(root,false);
        return res;
    }
    private TreeNode helper (TreeNode node, boolean hasParent){
        if(node==null) return null;
        if(!delNodes.contains(node.val)){
            if(!hasParent){
                res.add(node);
            }
            node.left = helper(node.left,true);
            node.right = helper(node.right,true);
        }
        else {
         helper(node.left,false);
         helper(node.right,false);
         return null;
    }
        return node;
    }
}

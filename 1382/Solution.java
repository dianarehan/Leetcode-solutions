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
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> sortedArray = new ArrayList<>();

        inOrderTraversal(sortedArray,root);
        return sortedArrayToBst(sortedArray,0,sortedArray.size()-1);

    }
    private void inOrderTraversal(ArrayList<Integer> sortedArray, TreeNode node){

        if(node ==null)
            return;
        inOrderTraversal(sortedArray,node.left);
        sortedArray.add(node.val);
        inOrderTraversal(sortedArray,node.right);
    }
    private TreeNode sortedArrayToBst(ArrayList<Integer> sortedArray, int left, int right){
        if(left>right){
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(sortedArray.get(mid));
        node.left = sortedArrayToBst(sortedArray,left,mid-1);
        node.right =sortedArrayToBst(sortedArray,mid+1,right);
        return node;
    }
}

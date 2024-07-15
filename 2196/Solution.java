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
 import java.util.HashMap;
 import java.util.ArrayList;
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> hashMap= new HashMap<>();
        ArrayList<Integer> children = new ArrayList<>();

        for(int [] desc: descriptions){
            int parentValue = desc[0];
            int childValue = desc[1];
            boolean isLeft = (desc[2]==1);

            TreeNode parent = hashMap.getOrDefault(parentValue,new TreeNode(parentValue));
            hashMap.put(parentValue,parent);

            TreeNode child = hashMap.getOrDefault(childValue,new TreeNode(childValue));
            hashMap.put(childValue,child);

            children.add(childValue);
            
            if(isLeft) parent.left=child;
            else parent.right =child;

        }
        TreeNode root =null;
        for(int i : hashMap.keySet()){
            if(!children.contains(i)){
                root = hashMap.get(i);
                break;
            } 
        }
        return root;
    }
}

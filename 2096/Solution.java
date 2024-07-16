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
    private String startPath ="";
    private String endPath ="";
    private StringBuilder path = new StringBuilder();

    public String getDirections(TreeNode root, int startValue, int destValue) {
        helper(root,startValue,destValue);
        int i =0;
        while(i<startPath.length()&&i<endPath.length()&&startPath.charAt(i)==endPath.charAt(i))
            i++;
        
        int upCount = startPath.length()-i;
        StringBuilder res= new StringBuilder();
        for(int j=0;j<upCount;j++) res.append('U');

        
        return res.toString()+endPath.substring(i);

    }
    private void helper(TreeNode node, int startValue, int endValue){
        if(node.val==startValue) startPath=path.toString();
        if(node.val==endValue) endPath=path.toString();

        if(node.left!=null){
            path.append('L');
            helper(node.left,startValue,endValue);
            path.deleteCharAt(path.length()-1);//that is because when you have not returned yet you might have been accumlating a wrong path 
        }
        if(node.right!=null){
            path.append('R');
            helper(node.right,startValue,endValue);
            path.deleteCharAt(path.length()-1);
        }
                
        
    }
}

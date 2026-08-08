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
    public int goodNodes(TreeNode root) {

        return dfs(root, root.val);
        
    }

    private int dfs(TreeNode root, int maxVal){

        if(root == null){
            return 0;
        }

        int result = root.val >= maxVal ? 1 : 0;
        if(root.left != null){
            result += dfs(root.left, Math.max(root.left.val, maxVal));
        }
        if(root.right != null){
            result += dfs(root.right, Math.max(root.right.val, maxVal));
        }
        return result;
    }
}

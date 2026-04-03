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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        stack1.add(p);
        stack2.add(q);

        while(!stack1.isEmpty()){

            TreeNode root1 = stack1.pop();
            TreeNode root2 = stack2.pop();

            if(root1 == null && root2 == null){
                continue;
            }

            if((root1 == null || root2 == null)
            || (root1.val != root2.val)){
                return false;
            }
           
            stack1.add(root1.right);
             stack1.add(root1.left);

            stack2.add(root2.right);
            stack2.add(root2.left);
            
            
            
        }

        return stack1.isEmpty() || stack2.isEmpty();
        
    }
}

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


        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();

        q1.offer(p);
        q2.offer(q);

        while(!q1.isEmpty() && !q2.isEmpty()){
            for (int i = q1.size(); i > 0; i--) {
            TreeNode one = q1.poll();
            TreeNode two = q2.poll();

            if(one == two){
                continue;
            }

            if(one == null || two == null || one.val != two.val){
                return false;
            }

                q1.offer(one.left);
                q1.offer(one.right);
                q2.offer(two.left);
                q2.offer(two.right);
            }    
        }
        
        if(q1.isEmpty() && q2.isEmpty()){
            return true;
        }
        return false;
        
    }
}

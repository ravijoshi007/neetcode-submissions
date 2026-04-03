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
        
        Queue<TreeNode> first = new LinkedList<>();
        Queue<TreeNode> second = new LinkedList<>();

        first.add(p);
        second.add(q);

        while(!first.isEmpty()){
            for(int i = first.size(); i > 0; i--){
                
                TreeNode one = first.poll();
                TreeNode two = second.poll();

                if(one == null && two == null){
                    continue;
                }
                if(one == null || two == null || one.val != two.val){
                    return false;
                }

                first.add(one.left);
                first.add(one.right);
                second.add(two.left);
                second.add(two.right);
            }
        }

      return true;  
    }
}

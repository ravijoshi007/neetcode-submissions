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
    public List<Integer> rightSideView(TreeNode root) {


        List<Integer> result  = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

            int rightSide = -1;
            int size = queue.size();

            for(int i=0; i< size; i++){

                TreeNode node = queue.poll();

                if(node != null){
                    rightSide = node.val;
                    queue.offer(node.left);
                    queue.add(node.right);
                }
            }
            if(rightSide != -1){
                result.add(rightSide);
            }
        }
    return result;
        
    }
}

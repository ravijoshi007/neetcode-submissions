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

        Queue<TreeNode> bfs = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        bfs.offer(root);

        while(!bfs.isEmpty()){
            TreeNode rightSide = null;
            int queueSize = bfs.size();

            for(int i=0; i<queueSize; i++){
                TreeNode node = bfs.poll();
                if(node != null){
                    rightSide = node;
                    bfs.add(node.left);
                    bfs.add(node.right);
                }
            }
            if(rightSide != null){
                    result.add(rightSide.val);
            }
        }
        return result;
        
    }
}

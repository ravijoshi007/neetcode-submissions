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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> node = new LinkedList<>();
        node.add(root);
        while(!node.isEmpty()){
            int size = node.size();
            List<Integer> currentNode = new ArrayList<>();
            for(int i=0; i<=size-1; i++){
                 //for(int i=node.size(); i>0; i--){
                TreeNode current = node.poll();
            if(current != null){
                currentNode.add(current.val);
                node.add(current.left);
                node.add(current.right);
            }
            }
            if(currentNode.size() > 0){
                result.add(currentNode);
            }
        }
        return result;        
    }
}

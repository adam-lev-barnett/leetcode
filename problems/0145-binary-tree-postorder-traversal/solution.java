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
    ArrayList<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postH(root);
        return res;
    }

    private void postH(TreeNode node) {
        if (node == null) return;
        postH(node.left);
        postH(node.right);
        res.add(node.val);
    }

}

package leetcode.MaximumDepthofBinaryTree;

/**
 * Created by Tianle Zhang on 2016/6/9.
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        TreeNode curr = root;
        if (curr.left != null) {
            curr = curr.left;
        }
        return 0;
    }



    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

}

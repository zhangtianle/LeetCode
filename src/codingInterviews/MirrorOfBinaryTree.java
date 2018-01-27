package codingInterviews;

import util.TreeNode;

public class MirrorOfBinaryTree {
    public void mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.right == null && root.left == null) {
            return;
        }
        TreeNode l = root.right;
        root.right = root.left;
        root.left = l;
        if (root.left != null) {
            mirror(root.left);
        }
        if (root.right != null) {
            mirror(root.right);
        }
    }
}

package leetcode;

import org.junit.Test;
import util.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode node) {
        if (node != null) {
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            invertTree(node.left);
            invertTree(node.right);
        }

    }

    @Test
    public void test() {
        invertTree(TreeNode.makeTreeNode("[3,9,20,null,null,15,7]"));
    }
}

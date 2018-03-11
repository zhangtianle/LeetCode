package leetcode;

import org.junit.Test;
import util.TreeNode;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return treeHeight(root) != -1;
    }

    private int treeHeight(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int lh = treeHeight(treeNode.left);
        if (lh == -1) {
            return -1;
        }
        int lr = treeHeight(treeNode.right);
        if (lr == -1) {
            return -1;
        }
        if (Math.abs(lh - lr) > 1) {
            return -1;
        } else {
            return Math.max(lh, lr) + 1;
        }
    }

    @Test
    public void test() {
        isBalanced(TreeNode.makeTreeNode("[3,9,20,null,null,15,7]"));
    }
}

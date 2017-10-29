package leetcode;

import org.junit.Test;
import util.TreeNode;

/**
 * Created by Kyle on 2017/10/29.
 */
public class PathSum {
    int localSum = 0;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.right == null && root.left == null && sum - root.val == 0)
            return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    private void traverse(TreeNode node) {
        if (node != null) {
            localSum += node.val;
            System.out.print(node.val + " -> ");
            traverse(node.left);
            traverse(node.right);
        }
    }

    @Test
    public void test() {
        TreeNode root = TreeNode.makeTreeNode("[5,4,8,11,13,4,7,2,null,null,null,1]");
        System.out.println(hasPathSum(root, 22));
    }
}

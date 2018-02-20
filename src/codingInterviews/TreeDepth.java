package codingInterviews;

import util.TreeNode;

public class TreeDepth {
    public int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = treeDepth(root.left);
        int right = treeDepth(root.right);

        return left > right ? left + 1 : right + 1;
    }
}

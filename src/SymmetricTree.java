import util.TreeNode;

/**
 * Created by Tianle Zhang on 2016/10/9.
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return recursion(root, root);
    }

    private boolean recursion(TreeNode left, TreeNode right) {
        if (left == null) return right == null;
        if (right == null) return left == null;
        return left.val == right.val && recursion(left.left, right.right) && recursion(left.right, right.left);
    }
}

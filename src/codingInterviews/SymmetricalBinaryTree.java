package codingInterviews;

import org.junit.Test;
import util.TreeNode;

public class SymmetricalBinaryTree {
    boolean isSymmetrical(TreeNode pRoot) {
        return isSymmetricalCore(pRoot, pRoot);
    }

    private boolean isSymmetricalCore(TreeNode pRoot1, TreeNode pRoot2) {
        if (pRoot1 == null && pRoot2 == null) {
            return true;
        }

        if (pRoot1 == null || pRoot2 == null) {
            return false;
        }

        if (pRoot1.val != pRoot2.val) {
            return false;
        }
        return isSymmetricalCore(pRoot1.left, pRoot2.right) && isSymmetricalCore(pRoot1.right, pRoot2.left);
    }

    @Test
    public void test() {
        System.out.println(isSymmetrical(TreeNode.makeTreeNode("[8,6,9,5,7,7,5]")));
    }
}

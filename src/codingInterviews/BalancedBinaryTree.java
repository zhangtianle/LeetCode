package codingInterviews;

import org.junit.Test;
import util.TreeNode;

public class BalancedBinaryTree {
    public boolean IsBalanced_Solution(TreeNode root) {
        Holder h = new Holder();
        return isBalanced(root, h);
    }

    private class Holder {
        int depth;
    }

    private boolean isBalanced(TreeNode root, Holder holder) {
        if (root == null) {
            holder.depth = 0;
            return true;
        }
        Holder l = new Holder(), r = new Holder();
        if (isBalanced(root.left, l) && isBalanced(root.right, r)) {
            int dif = l.depth - r.depth;
            if (dif <= 1 && dif >= -1) {
                holder.depth += (l.depth > r.depth ? l.depth : r.depth) + 1;
                return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(IsBalanced_Solution(TreeNode.makeTreeNode("[1,2,3,4,5,null,null,null,null,6]")));
    }
}

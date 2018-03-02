package codingInterviews;

import org.junit.Test;
import util.TreeNode;

public class KthNodeInBST {
    int index = 0;
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0) {
            return null;
        }

        return kthNodeCore(pRoot, k);
    }

    private TreeNode kthNodeCore(TreeNode pRoot, int k) {
        if (pRoot != null) {
            TreeNode target = kthNodeCore(pRoot.left, k);
            if (target != null)
                return target;

            if (k == ++index) {
                return pRoot;
            }
            target = kthNodeCore(pRoot.right, k);
            if (target != null) {
                return target;
            }
        }
        return null;
    }

    @Test
    public void test() {
        TreeNode treeNode = KthNode(TreeNode.makeTreeNode("[5,3,7,2,4,6,8]"), 3);
        System.out.println();
    }


}

package codingInterviews;

import org.junit.Test;
import util.TreeNode;

public class ConverBinarySearchTree {
    TreeNode leftHead = null;
    TreeNode rightHead = null;

    public TreeNode Convert(TreeNode pRootOfTree) {

        if (pRootOfTree == null) {
            return null;
        }

        if (pRootOfTree.left != null) {
            Convert(pRootOfTree.left);
        }

        if (leftHead == null) {
            leftHead = pRootOfTree;
            rightHead = pRootOfTree;
        } else {
            rightHead.right = pRootOfTree;
            pRootOfTree.left = rightHead;
            rightHead = pRootOfTree;
        }

        if (pRootOfTree.right != null) {
            Convert(pRootOfTree.right);
        }

        return leftHead;
    }


    @Test
    public void test() {
        Convert(TreeNode.makeTreeNode("[10,6,14,4,8,12,16]"));
    }
}

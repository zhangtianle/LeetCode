package leetcode;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyle on 2017/11/2.
 */
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(list, root);
        return list;
    }

    private void preOrder(List<Integer> list, TreeNode root) {
        if (root != null) {
            list.add(root.val);
            preOrder(list, root.left);
            preOrder(list, root.right);
        }
    }

    @Test
    public void test() {
        preorderTraversal(TreeNode.makeTreeNode("[1,null,2,3]"));
    }
}

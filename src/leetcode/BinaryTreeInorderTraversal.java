package leetcode;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kyle on 2017/11/1.
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(list, root);
        return list;
    }


    private void traversal(List<Integer> list, TreeNode root) {
        if (root!=null) {
            traversal(list, root.left);
            list.add(root.val);
            traversal(list, root.right);
        }
    }



    @Test
    public void test() {
        inorderTraversal(TreeNode.makeTreeNode("[3,9,20,null,null,15,7]"));
        System.out.println();
    }
}

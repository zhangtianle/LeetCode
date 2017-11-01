package leetcode;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        if (root != null) {
            traversal(list, root.left);
            list.add(root.val);
            traversal(list, root.right);
        }
    }

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.size() != 0) {
            while (stack.peek() != null) {
                stack.push(stack.peek().left);
            }
            stack.pop();
            if (stack.size() != 0) {
                TreeNode p = stack.pop();
                list.add(p.val);
                stack.push(p.right);
            }
        }
        return list;
    }

    public List<Integer> inorderTraversal3(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                p = stack.pop();
                list.add(p.val);
                p = p.right;
            }
        }
        return list;
    }


    @Test
    public void test() {
        inorderTraversal3(TreeNode.makeTreeNode("[3,9,20,null,null,15,7]"));
        System.out.println();
    }
}

package leetcode;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    List<List<Integer>> resList = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> path = new ArrayList<>();
        findPath(path, root);
        return change(resList);
    }

    private void findPath(List<Integer> path, TreeNode node) {
        // List<Integer> cPath = new ArrayList<Integer>();
        path.add(node.val);

        if (node.left == null && node.right == null) {
            resList.add(new ArrayList<>(path));
        }
        if (node.left != null)
            findPath(path, node.left);
        if (node.right != null)
            findPath(path, node.right);

        path.remove(path.size()-1);
    }

    private List<String> change(List<List<Integer>> lists) {
        List<String> r = new ArrayList<>();
        for (List<Integer> list : lists) {
            String s = "";
            for (int l : list) {
                s = s + l + "->";
            }
            if (s.length() > 0) {
                s = s.substring(0,s.length()-2);
                r.add(s);
            }
        }
        return r;
    }

    @Test
    public void test() {
        binaryTreePaths(TreeNode.makeTreeNode("[1,2,3,null,5]"));
    }
}

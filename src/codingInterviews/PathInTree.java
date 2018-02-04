package codingInterviews;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;

public class PathInTree {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        if (root == null) {
            return arrayLists;
        }

        path(root, target, 0, integers, arrayLists);
        return arrayLists;
    }

    private void path(TreeNode treeNode, int target, int currentTarget, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> arrayLists) {
        currentTarget += treeNode.val;
        list.add(treeNode.val);
        boolean leaf = treeNode.left == null && treeNode.right == null;
        if (currentTarget == target && leaf) {
            arrayLists.add(new ArrayList<>(list));
        }

        if (treeNode.left != null) {
            path(treeNode.left, target, currentTarget, list, arrayLists);
        }

        if (treeNode.right != null) {
            path(treeNode.right, target, currentTarget, list, arrayLists);
        }

        list.remove(list.size()-1);
    }

    @Test
    public void test() {
        FindPath(TreeNode.makeTreeNode("[3,9,20,null,null,15,7]"), 12);
    }
}

package codingInterviews;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreesInLines {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int layerSize = 1;
        int curSize = 0;
        queue.add(pRoot);
        while (!queue.isEmpty()) {

            TreeNode treeNode = queue.poll();

            list.add(treeNode.val);
            curSize++;
            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }

            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }

            if (layerSize == curSize) {
                layerSize = queue.size();
                curSize = 0;
                lists.add(list);
                list = new ArrayList<>();
            }
        }
        return lists;
    }

    @Test
    public void test() {
        Print(TreeNode.makeTreeNode("[3,9,20,null,null,15,7]"));
    }
}

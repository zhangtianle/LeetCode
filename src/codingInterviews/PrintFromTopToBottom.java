package codingInterviews;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom {
    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<TreeNode> integerQueue = new LinkedList<>();
        integerQueue.offer(root);
        while (integerQueue.size() != 0) {
            TreeNode treeNode = integerQueue.poll();
            list.add(treeNode.val);

            if (treeNode.left != null) {
                integerQueue.offer(treeNode.left);
            }

            if (treeNode.right != null) {
                integerQueue.offer(treeNode.right);
            }
        }
        return list;
    }

    @Test
    public void test() {
        printFromTopToBottom(null);
    }
}

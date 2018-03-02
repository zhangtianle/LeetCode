package codingInterviews;

import org.junit.Test;
import util.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class PrintTreeInZigzag {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (pRoot == null) {
            return lists;
        }

        int current = 0;
        int next = 1;

        Stack[] stack = new Stack[2];
        stack[0] = new Stack();
        stack[1] = new Stack();

        stack[current].push(pRoot);
        ArrayList<Integer> list = new ArrayList<>();

        while (!stack[0].isEmpty() || !stack[1].isEmpty()) {
            TreeNode node = (TreeNode) stack[current].pop();
            list.add(node.val);

            if (current == 0) {
                if (node.left != null) {
                    stack[next].push(node.left);
                }
                if (node.right != null) {
                    stack[next].push(node.right);
                }
            } else {
                if (node.right != null) {
                    stack[next].push(node.right);
                }
                if (node.left != null) {
                    stack[next].push(node.left);
                }
            }

            if (stack[current].isEmpty()) {
                lists.add(list);
                int temp = current;
                current = next;
                next = temp;
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

package codingInterviews;

import org.junit.Test;
import util.TreeNode;

/**
 * 根据前序遍历和中序遍历重建二叉树
 */
public class ConstructBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) {
            return null;
        }
        int len = pre.length;
        return construct(0, len - 1, 0, len - 1, pre, in);
    }

    private TreeNode construct(int startPre, int endPre, int startIn, int endIn, int[] pre, int[] in) {
        if (startPre > endPre || startIn > endIn)
            return null;

        TreeNode treeNode = new TreeNode(pre[startPre]);

        if (startPre == endPre) {
            if (startIn == endIn) {
                return treeNode;
            }
        }

        // 在中序遍历中找到根节点的值
        int rootIndex = startIn;
        while (rootIndex <= endIn && in[rootIndex] != treeNode.val) {
            rootIndex++;
        }

        int leftLen = rootIndex - startIn;
        int leftPreEnd = startPre + leftLen;
        if (leftLen > 0) {
            treeNode.left = construct(startPre + 1, leftPreEnd, startIn, rootIndex - 1, pre, in);
        }
        if (leftLen < endPre - startPre) {
            treeNode.right = construct(leftPreEnd + 1, endPre, rootIndex + 1, endIn, pre, in);
        }

        return treeNode;
    }

    @Test
    public void test() {
        reConstructBinaryTree(new int[]{1, 2, 3, 4}, new int[]{4, 3, 2, 1});
    }
}

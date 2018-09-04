package leetcode;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreeIterator {


    public class BSTIterator {

        TreeNode treeNode;
        TreeNode curNode;
        int index = 0;
        int size = 0;

        List<Integer> list = new ArrayList<>();

        public BSTIterator(TreeNode root) {
            this.treeNode = root;
            this.curNode = root;

            bulidList(root);
            this.index = 0;
            this.size = list.size();
        }

        private void bulidList(TreeNode root) {
            if (root != null) {
                bulidList(root.left);
                list.add(root.val);
                bulidList(root.right);
            }
        }

        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            if (index == size) {
                return false;
            } else {
                return true;
            }
        }

        /** @return the next smallest number */
        public int next() {
            return list.get(index++);
        }
    }
}

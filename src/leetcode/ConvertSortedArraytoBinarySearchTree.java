package leetcode;

import util.TreeNode;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int len = nums.length;
        return bstCore(0, len, nums);
    }

    private TreeNode bstCore(int lo, int hi, int[] nums) {
        TreeNode treeNode = new TreeNode(0);
        if (hi == lo) {
            return null;
        }

        int mid = (hi - lo) / 2 + lo;
        treeNode.val = nums[mid];
        treeNode.left = bstCore(lo, mid, nums);
        treeNode.right = bstCore(mid+1, hi, nums);
        return treeNode;
    }
}

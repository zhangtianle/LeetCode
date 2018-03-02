package codingInterviews;

import org.junit.Test;
import util.TreeNode;

public class SerializeBinaryTrees {
    int index = -1;
    StringBuffer sb = new StringBuffer();
    String Serialize(TreeNode root) {
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        } else {
            sb.append(root.val + ",");
        }
        Serialize(root.left);
        Serialize(root.right);
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        index++;
        String[] strings = str.split(",");
        TreeNode treeNode = null;
        if (!"#".equals(strings[index])) {
            treeNode = new TreeNode(Integer.parseInt(strings[index]));
            treeNode.left = Deserialize(str);
            treeNode.right = Deserialize(str);
        }
        return treeNode;
    }

    @Test
    public void test() {
        System.out.println(Serialize(TreeNode.makeTreeNode("[3,9,20,null,null,15,7]")));
        TreeNode deserialize = Deserialize("3,9,#,#,20,15,#,#,7,#,#,");
        System.out.println();
    }
}

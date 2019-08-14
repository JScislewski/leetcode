package binarysearchtreetogreatersumtree;

public class Solution {
    private int pre = 0;

    private TreeNode bstToGst(TreeNode root) {
        if (root.right != null) bstToGst(root.right);
        pre = root.val = pre + root.val;
        if (root.left != null) bstToGst(root.left);
        return root;
    }

}

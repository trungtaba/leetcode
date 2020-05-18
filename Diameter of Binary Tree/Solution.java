//https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/628/

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        order(root);
        return diameter;
    }

    int order(TreeNode node) {
        if (node == null)
            return 0;
        int left = order(node.left);

        int right = order(node.right);
        diameter = Math.max(diameter, left + right);
        return Math.max(left, right) + 1;
    }
}

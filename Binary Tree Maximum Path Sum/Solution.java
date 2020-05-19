//https://leetcode.com/problems/binary-tree-maximum-path-sum/

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findMax(root);
        return max;
    }

    private int findMax(TreeNode root) {
        if(root==null)return 0;
        int left=findMax(root.left);
        int right=findMax(root.right);
        int sum = root.val + Math.max(left, 0) + Math.max(right, 0);
        max = Math.max(sum, max);
        sum = root.val + Math.max(0, Math.max(left, right));
        return sum;
    }
}
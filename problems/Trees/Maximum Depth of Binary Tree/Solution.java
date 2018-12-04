//https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/555/

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int maxLeft=maxDepth(root.left);
        int maxRight=maxDepth(root.right);
        return 1+ (maxLeft<maxRight?maxRight:maxLeft);
    }
}

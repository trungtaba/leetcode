//https://leetcode.com/problems/balanced-binary-tree/

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    boolean isBalance=true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return isBalance;
    }
    
    int depth(TreeNode node){
        if(node==null) return 0;
        
        int left=depth(node.left);
        int right=depth(node.right);
        if(Math.abs(left-right)>1) isBalance=false;
        return Math.max(left, right)+1;
    }
}

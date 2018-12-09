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
    public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode node, long left, long right){
        if(node.val<=left || node.val>=right){
            return false;
        }
        
        if(node.left!=null && !isValidBST(node.left, left, node.val)){
            return false;
        }
        
        if(node.right!=null && !isValidBST(node.right, node.val, right)){
            return false;
        }
        
        return true;
    }
}

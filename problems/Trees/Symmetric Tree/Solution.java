//https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/627/

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode left = null;
        TreeNode right = null;

        if (root.left != null) {
            left = root.left;
        }
        if (root.right != null) {
            right = root.right;
        }

        return isSymmetric(left, right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        
        if (left == null && right==null) {
            return true;
        }
        
        if((left!=null && right==null)||(left==null && right!=null)){
            return false;
        }

        if (left.val != right.val) {
            return false;
        }
        
        if (left.left == null && right.right != null) {
            return false;
        }    
        
        if (left.left != null && right.right == null) {
            return false;
        }
        
        if (left.right != null && right.left == null) {
            return false;
        }
        
        if (left.right == null && right.left != null) {
            return false;
        }

        if (left.left != null && right.right != null && !isSymmetric(left.left, right.right)) {
            return false;
        }

        if (left.right != null && right.left != null && !isSymmetric(left.right, right.left)) {
            return false;
        }

        return true;
    }
}


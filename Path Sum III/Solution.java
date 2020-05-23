//https://leetcode.com/problems/path-sum-iii/

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
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return df(root, sum)+pathSum(root.left, sum)+pathSum(root.right, sum);
    }

    private int df(TreeNode root, int sum){
        if(root==null) return 0;
        return (root.val==sum?1:0)+ df(root.left, sum-root.val)+df(root.right, sum-root.val);
    }
}
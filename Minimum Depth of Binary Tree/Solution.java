//https://leetcode.com/problems/minimum-depth-of-binary-tree/



class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    int min=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        traversal(root,0);
        return  min;
    }
    int traversal(TreeNode node,int depth){
        if(node==null) return 0;
        depth++;
        if(node.left==null && node.right==null){
            min=Math.min(min, depth);
        }
        int left=traversal(node.left,depth);
        int right=traversal(node.right,depth);
        
        return Math.min(left, right)+1;
    }
}

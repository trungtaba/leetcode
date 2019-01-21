//https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/

/**
 * Definition for a binary tree node.
 */
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        int firstMin = findMin(root, Integer.MIN_VALUE);
        int secondMin = findMin(root, firstMin);
        return secondMin == Integer.MAX_VALUE ? - 1 : secondMin;
    }
    
    private int findMin(TreeNode root, int bound){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        else if(root.val <= bound){
            return Math.min(findMin(root.left, bound), findMin(root.right, bound));
        }
        else{
            return Math.min(root.val, Math.min(findMin(root.left, bound), findMin(root.right, bound)));
        }
        
    }
}

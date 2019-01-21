//https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/628/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    int result=0;
    public int findTilt(TreeNode root) {
        order(root);
        return result;
    }
    
    int order(TreeNode root){
        if (root == null) return 0;
        
        int left = order(root.left);
        int right = order(root.right);
        
        result += Math.abs(left - right);
        
        return left + right + root.val;
    }
}





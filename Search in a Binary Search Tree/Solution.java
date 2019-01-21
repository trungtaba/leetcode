//https://leetcode.com/problems/search-in-a-binary-search-tree/


import java.util.ArrayList;
import java.util.Collections;
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root.val==val){
            return root;
        }
        if(root.left!=null){
            TreeNode left=searchBST(root.left, val);
            if(left!=null)return left;
        }
        if(root.right!=null){
            TreeNode right=searchBST(root.right, val);
            if(right!=null)return right;
        }
        return null;
    }
}

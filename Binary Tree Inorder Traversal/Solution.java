//https://leetcode.com/problems/binary-tree-inorder-traversal/

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
    public List<Integer> inorderTraversal(TreeNode root) {
        return traversal(root);
    }

    public List<Integer> traversal(TreeNode node) {
        List<Integer> result=new ArrayList<>();
        if(node==null){
            return result;
        }
        if(node.left!=null){
            List<Integer> left=traversal(node.left);
            result.addAll(left);
        }
        result.add(node.val);
        if(node.right!=null){
            List<Integer> right=traversal(node.right);
            result.addAll(result.size(), right);
        }
        return result;   
    }
}

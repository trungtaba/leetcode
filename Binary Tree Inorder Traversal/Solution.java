//https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    // public List<Integer> inorderTraversal(TreeNode root) {
    // return traversal(root);
    // }

    // public List<Integer> traversal(TreeNode node) {
    // List<Integer> result=new ArrayList<>();
    // if(node==null){
    // return result;
    // }
    // if(node.left!=null){
    // List<Integer> left=traversal(node.left);
    // result.addAll(left);
    // }
    // result.add(node.val);
    // if(node.right!=null){
    // List<Integer> right=traversal(node.right);
    // result.addAll(result.size(), right);
    // }
    // return result;
    // }

    // without Recursive
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curNode = root;
        while (root != null || !stack.isEmpty()) {
            while (curNode != null) {
                stack.push(curNode);
                curNode = curNode.left;
            }
            curNode = stack.pop();
            result.add(curNode.val);
            curNode = curNode.right;
        }

        return result;
    }
}

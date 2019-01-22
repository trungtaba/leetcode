//https://leetcode.com/problems/binary-tree-paths/

import java.util.ArrayList;
import java.util.List;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if(root!=null)
        treePaths(root, "");
        return result;
    }

    void treePaths(TreeNode node, String s) {
        if (s.equals("") || s.isEmpty()) {
            s = node.val + "";
        } else {
            s = s + "->" + node.val;
        }
        if (node.left == null && node.right == null) {
            result.add(s);
        }
        if (node.left != null) {
            treePaths(node.left, s);
        }
        if (node.right != null) {
            treePaths(node.right, s);
        }
    }
}


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

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> nodeValues = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Queue<TreeNode> current = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();

        current.add(root);
        while (!current.isEmpty()) {
            TreeNode node = current.remove();

            if (node.left != null) {
                next.add(node.left);
            }

            if (node.right != null) {
                next.add(node.right);
            }

            nodeValues.add(node.val);

            if (current.isEmpty()) {
                current = next;
                next = new LinkedList<>();
                list.add(nodeValues);
                nodeValues = new ArrayList<>();
            }
        }
        return list;
    }

}

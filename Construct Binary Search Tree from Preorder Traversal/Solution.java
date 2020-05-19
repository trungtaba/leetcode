//https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

//   Definition for a binary tree node.
class TreeNode {
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
    int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = constructTree(preorder, preorder[0], Integer.MIN_VALUE, Integer.MAX_VALUE);
        return root;
    }

    public TreeNode constructTree(int[] preorder, int data, int min, int max) {
        if (index < preorder.length) {
            if (preorder[index] > min && preorder[index] < max) {
                TreeNode root = new TreeNode(data);
                index++;
                if (index < preorder.length) {
                    root.left = constructTree(preorder, preorder[index], min, data);
                }
                if (index < preorder.length) {
                    root.right = constructTree(preorder, preorder[index], data, max);
                }
                return root;
            }
        }
        return null;
    }
}
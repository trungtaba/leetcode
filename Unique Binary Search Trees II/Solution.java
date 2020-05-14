import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/unique-binary-search-trees-ii/
 * 
 */

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

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> tree = new ArrayList<>();
        if (n == 0)
            return tree;

        return createTrees(1,n);
    }

    public List<TreeNode>  createTrees(int left, int right) {
        List<TreeNode> result = new ArrayList<>();
        if(left>right) {
            result.add(null);
            return result;
        }
        for(int i=left; i<=right;i++){
            List<TreeNode>  leftTree=createTrees(left, i);
            List<TreeNode>  rightTree=createTrees(i+1, right);
            for(TreeNode l: leftTree){
                for(TreeNode r: rightTree){
                    TreeNode curNode= new TreeNode(i, l, r);
                    result.add(curNode);
                }
            }
        }
        return result;
    }
}
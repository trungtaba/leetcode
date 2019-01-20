//https://leetcode.com/contest/weekly-contest-120/problems/distribute-coins-in-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int distributeCoins(TreeNode root) {
        return dfs(root, new HashMap<TreeNode,Integer>());
    }

    int dfs(TreeNode n, HashMap<TreeNode,Integer> count) {
        if(!count.containsKey(n)) {
            count.put(n, n.val);
        }
        int coinsNum = count.get(n);
        int res = 0;
        if(n.left!=null){
            TreeNode left=n.left;
            res += dfs(left, count);
            coinsNum += count.get(left);
            res += Math.abs(count.get(left));
        }
        
        if(n.right!=null){
            TreeNode right=n.right;
            res += dfs(right, count);
            coinsNum += count.get(right);
            res += Math.abs(count.get(right));
        }
        count.put(n, coinsNum - 1);
        return res;
    }
}
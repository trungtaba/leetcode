//https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

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
    private TreeNode target;
    private int k;
    private List<Integer> list;
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        target = target;
        k = K;
        list = new ArrayList<>();
        dfs(root, -1);
        return list;
    }
    
    private int dfs(TreeNode node, int d) {
        if(node==null) return -1;
        
    }
}

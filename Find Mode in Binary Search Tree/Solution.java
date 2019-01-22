
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

//https://leetcode.com/problems/find-mode-in-binary-search-tree/

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    TreeMap<Integer, Integer> tree=new TreeMap<>();
    int mode=-1;
    public int[] findMode(TreeNode root) {
        if(root==null) return new int[0];
        traversal(root);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:tree.keySet()){
            if(tree.get(i)==mode){
                list.add(i);
            }
        }
        int[]result=new int[list.size()];
        int index=0;
        for(int i:list){
            result[index++]=i;
        }
        return result;
    }
    
    void traversal(TreeNode node){
        if(node==null){
            return;
        }
    }
}

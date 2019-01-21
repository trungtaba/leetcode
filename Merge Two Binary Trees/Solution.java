/**
 * Definition for a binary tree node.
 */ 
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1, t2);
    }
    
    public TreeNode merge(TreeNode node1, TreeNode node2){
        if(node1==null){
            return node2;
        }else if(node2==null){
            return node1;
        }
        
        TreeNode tmp=new TreeNode(node1.val+node2.val);
        tmp.left=merge(node1.left, node2.left);
        tmp.right=merge(node1.right, node2.right);
        
        return tmp;
    }
}
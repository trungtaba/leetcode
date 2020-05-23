//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

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

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        boolean leftToRight=true;
        Stack<TreeNode> current=new Stack<>();
        Stack<TreeNode> next=new Stack<>();
        current.push(root); 
        List<Integer> list=new ArrayList<>();
        while(!current.isEmpty()){
            TreeNode node=current.pop();
            list.add(node.val);
             //System.out.println(node.val);
            if(leftToRight){
                if(node.left!=null) next.add(node.left);
                if(node.right!=null) next.add(node.right);
            }else{
                if(node.right!=null) next.add(node.right);
                if(node.left!=null) next.add(node.left);
            }

            if(current.isEmpty()){
                current=next;
                next=new Stack<>();
                leftToRight=!leftToRight;
                result.add(list);
                list=new ArrayList<>();
            }
        }
        
        return result;
    }
}
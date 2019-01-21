//https://leetcode.com/problems/complete-binary-tree-inserter/

import java.util.ArrayList;


class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


class CBTInserter {
    ArrayList<TreeNode>  list;
    public CBTInserter(TreeNode root) {
        list=new ArrayList<>();
        this.list.add(root);
        for(int i=0;i<list.size();++i){
            if(list.get(i).left!=null){
                list.add(list.get(i).left);
            }
            if(list.get(i).right!=null){
                list.add(list.get(i).right);
            }
        }
    }
    
    public int insert(int v) {
        TreeNode node=new TreeNode(v);
        int size=list.size();
        list.add(node);
        
        if(size%2==1){
            list.get((size-1)/2).left=node;
        }else{
            list.get((size-1)/2).right=node;
        }
        return list.get((size-1)/2).val;
    }
    
    public TreeNode get_root() {
        return list.get(0);
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */

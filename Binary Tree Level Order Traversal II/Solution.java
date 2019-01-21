//https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

import java.util.ArrayList;
import java.util.Collections;
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
     public List<List<Integer>> levelOrderBottom(TreeNode root)  {
         if(root==null){
             return new ArrayList<>();
         }
        List<List<Integer>> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(true){
            int size=queue.size();
            if(size==0){
                break;
            }
            List<Integer>current=new ArrayList<>();
            while(size>0){
                TreeNode node=queue.poll();
                current.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                size--;
            }

            list.add(current);
        }
        Collections.reverse(list);
        return list;
    }
}

//https://leetcode.com/problems/average-of-levels-in-binary-tree/

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

     public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(true){
            int size=queue.size();
            int tmp=size;
            if(size==0){
                break;
            }
            long sum=0;
            while(size>0){
                TreeNode node=queue.poll();
                //System.out.println("node.val="+node.val);
                sum+=node.val;
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                size--;
            }
            //System.out.println("sum="+sum+" size="+tmp);
            list.add(sum/(double)tmp);
        }
        
        return list;
    }
}

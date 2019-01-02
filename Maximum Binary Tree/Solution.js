//https://leetcode.com/problems/maximum-binary-tree/
/**
 * Definition for a binary tree node.
 */
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}
/**
 * @param {number[]} nums
 * @return {TreeNode}
 */
var constructMaximumBinaryTree = function(nums) {
    let root=maximumBinaryTree(nums);
    return root;
};

var maximumBinaryTree=function(array){
    if(array.length==1){
        return new TreeNode(array[0]);;
    }

    let max=array[0];
    let index=0;
    for(let i=0;i<array.length;i++){
        if(max<array[i]){
            max=array[i];
            index=i;
        }
    }

    let node=new TreeNode(max);
    if(index!==0){
        node.left=maximumBinaryTree(array.slice(0,index));
    }

    if(index!==array.length-1){
        node.right=maximumBinaryTree(array.slice(index+1,array.length+1));
    }
    
   return node;
}
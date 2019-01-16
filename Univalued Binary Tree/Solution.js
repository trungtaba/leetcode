//https://leetcode.com/contest/weekly-contest-117/problems/univalued-binary-tree/

/**
 * Definition for a binary tree node.
 */
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isUnivalTree = function (root) {
    return univalTree(root,root.value)
};

var univalTree=function(node,value){
    if(node !==null){
        if(node.val!==value){
            return false;
        }
        let left=true;
        if(node.left!==null){
             left=univalTree(node.left,value)
        }
        let right=true;
        if(node.right!==null){
             right=univalTree(node.right,value)
        }
        return left && right
    }
    return true
}
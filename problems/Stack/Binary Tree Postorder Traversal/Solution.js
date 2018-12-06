//https://leetcode.com/problems/binary-tree-postorder-traversal/


//  Definition for a binary tree node.
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var postorderTraversal = function (root) {
    let array=[]
    traversal(array,root)
    return array
};

var traversal= function(array, node){
    if(node===null) return
    if(node.left!==null)
        traversal(array,node.left)
    if(node.right!==null)
        traversal(array,node.right)
    array.push(node.val)
}
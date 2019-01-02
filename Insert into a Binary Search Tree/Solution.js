//https://leetcode.com/problems/insert-into-a-binary-search-tree/

/**
 * Definition for a binary tree node.
 */
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @param {number} val
 * @return {TreeNode}
 */
var insertIntoBST = function (root, val) {
    const tmp=root;
    insert(tmp,val);
    return root;
};

var insert=function(node, data){
    if(node!==null){
        if(node.val<data){
            if(node.right === null){
                //console.log(`insert to right ${node.val}`)
                node.right=new TreeNode(data);
                return;
            }
            insert(node.right,data);
        }else {
            if(node.left === null){
                //console.log(`insert to left ${node.val}`)
                node.left=new TreeNode(data);
                return;
            }
            insert(node.left,data);
        }
    }
}
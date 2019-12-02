// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

/**
 * Definition for a binary tree node.
 */
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */

var bstToGst = function (root) {
    computeVal(root, 0);
        return root;
};

var computeVal = function( root,  val) {
    if(root == null) {
        return val;
    }
    
    root.val = computeVal(root.right, val) + root.val;
    return computeVal(root.left, root.val);
}
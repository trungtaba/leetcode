//https://leetcode.com/problems/binary-tree-pruning/
/**
 * Definition for a binary tree node.
 * */
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var pruneTree = function (root) {
    remove(root);
    return root;
};

var remove = function (node) {
    if (node !== null) {
        if (node.left !== null && isPrune(node.left)) {
            node.left = null;
        }
        if (node.right !== null && isPrune(node.right)) {
            node.right = null;
        }
        if (node.left !== null)
            remove(node.left);
        if (node.right !== null)
            remove(node.right);
    }
}

var isPrune = function (node) {
    if (node != null) {
        return node.val === 0 && isPrune(node.left) && isPrune(node.right);
    }

    return true;
}
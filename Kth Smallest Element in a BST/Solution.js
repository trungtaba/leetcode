//https://leetcode.com/problems/kth-smallest-element-in-a-bst/

/**
 * Definition for a binary tree node. */
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @param {number} k
 * @return {number}
 */
let kthSmallest = function (root, k) {
    let array = [];
    retreval(root, array);
    return array[k - 1];
};

let retreval = function (node, array) {
    if (node !== null) {
        if (node.left !== null)
            retreval(node.left, array);
        array.push(node.val);
        if (node.right !== null)
            retreval(node.right, array);
    }
}
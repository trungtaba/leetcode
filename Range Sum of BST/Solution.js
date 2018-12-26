//https://leetcode.com/problems/range-sum-of-bst/

/**
 * Definition for a binary tree node.
 */
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
var rangeSumBST = function (root, L, R) {
    let result=0;
    result=SumBST(root,0,L,R);
    return result;
};

let SumBST=function(node,sum,L,R){
    if(node!==null){
        if(node.val<=R&&node.val>=L){
            sum+=node.val;
        }
        sum=SumBST(node.left,sum,L,R);
        sum=SumBST(node.right,sum,L,R);
    }
    return sum;
}
/**
 * Definition for a binary tree node.
 * */
  function TreeNode(val) {
      this.val = val;
      this.left = this.right = null;
 }
 
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isCompleteTree = function(root) {
    if(root===null)return true;
    let queue=[];
    let falg=false;
    queue.push(root);
    while(queue.length!==0){
        tmp=queue.shift();
        if(tmp.left!==null){
            if(falg==true){
                return false;
            }
            queue.push(tmp.left);
        }else{
            falg=true;
        }
        if(tmp.right!==null){
            if(falg==true){
                return false;
            }
            queue.push(tmp.right);
        }else{
            falg=true;
        }
    }
    return true;
};
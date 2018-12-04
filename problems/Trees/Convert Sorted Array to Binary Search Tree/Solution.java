//https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/631/

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int length=nums.length;
        if(length==0){
            return null;
        }
        
        TreeNode root=new TreeNode(nums[length/2]);
        makeBSTleft(root, nums, 0, length/2-1);
        makeBSTright(root, nums, length/2+1, length-1);
        return root;
    }
    
    public void makeBSTleft(TreeNode root, int []nums, int begin, int end){
        if(begin<=end && begin>=0 && end<nums.length){
            int mid=(begin+end)/2;
            root.left=new TreeNode(nums[mid]);
            makeBSTleft(root.left, nums, begin, mid-1);
            makeBSTright(root.left, nums, mid+1, end);
        }   
    }
    
    public void makeBSTright(TreeNode root, int []nums, int begin, int end){
        if(begin<=end && begin>=0 && end<nums.length){
            int mid=(begin+end)/2;
            root.right=new TreeNode(nums[mid]);
            makeBSTleft(root.right, nums, begin, mid-1);
            makeBSTright(root.right, nums, mid+1, end);
            
        } 
    }
}
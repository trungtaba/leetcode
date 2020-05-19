//https://leetcode.com/problems/path-sum-ii/submissions/

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<>();
    if(root == null) 
        return result;
 
    ArrayList<Integer> l = new ArrayList<>();
    l.add(root.val);
    dfs(root, sum-root.val, result, l);
    return result;
}
 
public void dfs(TreeNode t, int sum, List<List<Integer>> result, ArrayList<Integer> l){
    if(t.left==null && t.right==null && sum==0){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.addAll(l);
        result.add(temp);
    }
 
    //search path of left node
    if(t.left != null){
        l.add(t.left.val);
        dfs(t.left, sum-t.left.val, result, l);
        l.remove(l.size()-1);
    }
 
    //search path of right node
    if(t.right!=null){
        l.add(t.right.val);
        dfs(t.right, sum-t.right.val, result, l);
        l.remove(l.size()-1);
    }
}
}
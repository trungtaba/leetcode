//https://leetcode.com/problems/all-possible-full-binary-trees/


class Solution {
    Map<Integer,List<TreeNode>> cache= new HashMap<>();
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> res = new ArrayList<>();
        if(N%2==0){
            return res;
        }
        if(cache.containsKey(N)){
            return cache.get(N);
        }
        if(N==1){
            res.add(new TreeNode(0));
            return res;
        }
        
        N=N-1;
        for(int i=1; i<N;i+=2){
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(N-i);
            for(TreeNode nl: left){
                for(TreeNode nr:right){
                    TreeNode cur = new TreeNode(0);
                    cur.left=nl;
                    cur.right=nr;
                    res.add(cur);
                }
            }
        }
        cache.put(N,res);
        return res;
    }
}
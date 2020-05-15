//https://leetcode.com/problems/combinations/submissions/
import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(new ArrayList<>(), n, k, 1);
        return result;
    }

    private void backtrack(List<Integer> array, int n, int k, int x){
        if(array.size()==k) {
            result.add(new ArrayList(array));
            return;
        }
        for(int i=x;i<=n-(k-array.size())+1;i++){
            array.add(i);
            backtrack(array, n, k, i+1);
            array.remove(array.size()-1);
        }
    }
}
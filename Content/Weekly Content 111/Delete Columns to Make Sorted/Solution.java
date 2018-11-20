//https://leetcode.com/contest/weekly-contest-111/problems/delete-columns-to-make-sorted/
import java.util.HashMap;


class Solution {
    public int minDeletionSize(String[] A) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        int length=A[0].length();
        for(int i=0;i<length;i++){
            for(int j=1;j<A.length;j++){
                if(A[j].charAt(i)<A[j-1].charAt(i))
                {
                    if(!map.containsKey(i)){
                        map.put(i, Boolean.TRUE);
                    }
                    break;
                }
            }
        }
        return map.keySet().size();
    }
}
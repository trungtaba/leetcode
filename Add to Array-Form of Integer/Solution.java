import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/contest/weekly-contest-123/problems/add-to-array-form-of-integer/

class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result=new ArrayList<>();
        int remain=0;
        int n=A.length-1;
        int tmp;
        while(K!=0 && n>-1){
            tmp=K%10+A[n]+remain;
            //System.out.println("tmp="+tmp+" remain="+remain);
            if(tmp<10){
                result.add(tmp);
                remain=0;
            } 
            else{
                result.add(tmp%10);
                remain=tmp/10;
            }
            K/=10;
            n--;
        }
        //System.out.println("K="+K+" n="+n);
        if(K>0){
            while(K>0){
                tmp=K%10+remain;
                if(tmp<10){
                    result.add(tmp);
                    remain=0;
                } 
                else{
                    result.add(tmp%10);
                    remain=tmp/10;
                }
                K/=10;
            }
        }
        if(n>-1){
            while(n>-1){
                tmp=A[n--]+remain;
                if(tmp<10){
                    result.add(tmp);
                    remain=0;
                } 
                else{
                    result.add(tmp%10);
                    remain=tmp/10;
                }
            }
        }
        if(remain!=0){
            result.add(remain);
        }
        Collections.reverse(result);
        return result;
    }
}
//https://leetcode.com/contest/weekly-contest-120/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] A) {
        int length=A.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:A){
            list.add(i*i);
        }
        Collections.sort(list);
        int[]result=new int[length];
        for(int i=0;i<length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
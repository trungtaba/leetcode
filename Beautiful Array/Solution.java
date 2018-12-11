//https://leetcode.com/problems/beautiful-array/

class Solution {
    public int[] beautifulArray(int N) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        while(list.size() < N) {
            List<Integer> next = new ArrayList<>();
            for(int v: list) {
                if(2*v-1 <= N) {
                    next.add(2 * v -1);    
                }                
            }
            for(int v: list) {
                if(2*v <= N) {
                    next.add(2 * v);    
                }                
            }
            list = next;
        }
        int[] ret = new int[N];
        for(int i = 0; i < N; ++i) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}
class Solution {
    public int fib(int N) {
        HashMap<Integer,Integer> cache=new HashMap<>();
        if(N<2) return N;
        if(cache.containsKey(N)) return cache.get(N);
        int result;
        result=fib(N-1)+fib(N-2);
        return result;
    }
}
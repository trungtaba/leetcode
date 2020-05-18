//https://leetcode.com/problems/last-stone-weight/

class Solution {
    PriorityQueue<Integer> queue = new PriorityQueue<Integer>(); 
    public int lastStoneWeight(int[] stones) {
        for(int stone:stones){
            queue.add(-stone);
        }
        while(queue.size()>1){
            int first=queue.remove();
            int second=queue.remove();
            if(first!=second){
                queue.add(-second+first);
            }
        }
        return queue.isEmpty()?0:-queue.remove();
    }
}
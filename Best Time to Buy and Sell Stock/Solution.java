//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length <2) return 0;
        int max=Integer.MIN_VALUE, min=prices[0];

        for(int i=0;i<prices.length;i++){
            max=Math.max(max, prices[i]-min);
            min=Math.min(min, prices[i]);
        }
        return max;
    }
}
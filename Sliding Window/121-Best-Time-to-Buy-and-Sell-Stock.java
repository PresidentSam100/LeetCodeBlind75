/*
121. Best Time to Buy and Sell Stock
Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] - min > profit) {
                profit = prices[i] - min;
            }
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return profit;
    }
}
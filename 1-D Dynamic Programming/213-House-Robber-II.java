/*
213. House Robber II
Link: https://leetcode.com/problems/house-robber-ii/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int rob(int[] nums) {
        // Only one house
        if (nums.length == 1) {
            return nums[0];
        }
        // Houses robbed must be ideally separated by either 2 or 3 spaces
        int[] dp = new int[nums.length + 3];
        int ans = 0;
        // Check all but last house
        for (int i = 3; i < dp.length - 1; i++) {
            dp[i] = nums[i - 3] + Math.max(dp[i - 3], dp[i - 2]);
            ans = Math.max(ans, dp[i]);
        }
        dp = new int[nums.length + 3];
        // Check all but first house
        for (int i = 4; i < dp.length; i++) {
            dp[i] = nums[i - 3] + Math.max(dp[i - 3], dp[i - 2]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}

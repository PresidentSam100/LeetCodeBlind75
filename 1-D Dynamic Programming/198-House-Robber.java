/*
198. House Robber
Link: https://leetcode.com/problems/house-robber/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 3];
        int ans = 0;
        for (int i = 3; i < dp.length; i++) {
            // Houses robbed must be ideally separated by either 2 or 3 spaces
            dp[i] = nums[i - 3] + Math.max(dp[i - 3], dp[i - 2]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}

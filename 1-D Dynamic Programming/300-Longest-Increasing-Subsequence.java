/*
300. Longest Increasing Subsequence
Link: https://leetcode.com/problems/longest-increasing-subsequence/
Code by: Sam Lu
Language: Java
Time Complexity: O(nlogn)
Space Complexity: O(n)
*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int[] sums = new int[n];
        for (int i = 0; i < n; i++) {
            int x = 0;
            int y = ans;
            while (x != y) {
                int z = (x + y) / 2;
                if (sums[z] < nums[i]) {
                    x = z + 1;
                } else {
                    y = z;
                }
            }
            sums[x] = nums[i];
            if (x == ans) {
                ans++;
            }
        }
        return ans;
    }
}

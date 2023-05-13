/*
268. Missing Number
Link: https://leetcode.com/problems/missing-number/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= (i + 1) ^ nums[i];
        }
        return ans;
    }
}
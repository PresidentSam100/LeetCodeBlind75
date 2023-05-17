/*
11. Container With Most Water
Link: https://leetcode.com/problems/container-with-most-water/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int ans = 0;
        while (l < r) {
            ans = Math.max(ans, Math.min(height[l], height[r]) * (r - l));                   
            if (height[l] < height[r]) {
                l += 1;
            } else {
                r -= 1;
            }                
        }
        return ans;
    }
}
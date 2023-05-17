/*
153. Find Minimum in Rotated Sorted Array
Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
Code by: Sam Lu
Language: Java
Time Complexity: O(log n)
Space Complexity: O(1)
*/
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        while (l + 1 < h) {
            int m = l + (h - l) / 2;
            if (nums[m] > nums[l] && nums[m] > nums[h]) {
                l = m;
            } else {
                h = m;
            }
        }
        return Math.min(nums[l], nums[h]);
    }
}
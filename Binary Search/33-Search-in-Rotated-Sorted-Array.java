/*
33. Search in Rotated Sorted Array
Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
Code by: Sam Lu
Language: Java
Time Complexity: O(log n)
Space Complexity: O(1)
*/
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] >= nums[l]) {
                if (nums[l] <= target && target < nums[m]) {
                    h = m - 1;
                }
                else {
                    l = m + 1;
                }
            } else {
                if (nums[m] < target && target <= nums[h]) {
                    l = m + 1;
                }
                else {
                    h = m - 1;
                }
            }
        }
        return -1;
    }
}
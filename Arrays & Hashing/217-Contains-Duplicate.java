/*
217. Contains Duplicate
Link: https://leetcode.com/problems/contains-duplicate/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (set.contains(num))
                return true;
            else
                set.add(num);
        }
        return false;
    }
}
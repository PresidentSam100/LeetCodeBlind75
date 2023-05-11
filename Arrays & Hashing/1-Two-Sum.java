/*
1. Two Sum
Link: https://leetcode.com/problems/two-sum/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(n)
Note: This code answers the follow-up of coding an algorithm less than quadratic time complexity.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            if (map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
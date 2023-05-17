/*
70. Climbing Stairs
Link: https://leetcode.com/problems/climbing-stairs/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public int climbStairs(int n) {
        if (n == 1) 
            return 1;
        if (n == 2) 
            return 2;
        int one = 1;
        int two = 2;
        int res = 0;
        while (n > 2) {
            res = one + two;
            one = two;
            two = res;
            n--;
        }
        return res;
    }
}
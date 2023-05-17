/*
371. Sum of Two Integers
Link: https://leetcode.com/problems/sum-of-two-integers/
Code by: Sam Lu
Language: Java
Time Complexity: O(1)
Space Complexity: O(1)
*/
class Solution {
    public int getSum(int a, int b) {
        while (b != 0)
        {
            int c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }
}
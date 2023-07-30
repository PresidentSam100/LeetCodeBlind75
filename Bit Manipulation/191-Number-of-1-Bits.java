/*
191. Number of 1 Bits
Link: https://leetcode.com/problems/number-of-1-bits/
Code by: Sam Lu
Language: Java
Time Complexity: O(1)
Space Complexity: O(1)
*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }
}

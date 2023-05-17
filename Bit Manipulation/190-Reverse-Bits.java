/*
190. Reverse Bits
Link: https://leetcode.com/problems/reverse-bits/
Code by: Sam Lu
Language: Java
Time Complexity: O(1)
Space Complexity: O(1)
*/
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        int index = 32;
        while (index > 0){
            ans = (ans << 1) | (n & 1);
            n >>= 1;
            index--;
        }
        return ans;
    }
}
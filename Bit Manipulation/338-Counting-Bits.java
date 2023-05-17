/*
338. Counting Bits
Link: hhttps://leetcode.com/problems/counting-bits/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(n)
Note: This code answers the follow-up of coding an algorithm in linear time and in a single pass as well as not using any built-in functions.
*/
class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i & (i - 1)] + 1; 
        }
        return arr;    
    }
}
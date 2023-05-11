/*
242. Valid Anagram
Link: https://leetcode.com/problems/valid-anagram/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }
}

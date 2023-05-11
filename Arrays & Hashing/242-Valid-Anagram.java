/*
242. Valid Anagram
Code by: Sam Lu
Language: Java
Time Complexity: O(nlogn)
Space Complexity: O(n)
*/
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss, tt);
    }
}
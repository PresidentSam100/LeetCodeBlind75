/*
125. Valid Palindrome
Link: https://leetcode.com/problems/valid-palindrome/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public boolean isPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p2 >= p1) {
            char l = Character.toLowerCase(s.charAt(p1));
            char r = Character.toLowerCase(s.charAt(p2));      
            if (check(l) && check(r)) {
                if (l != r) {
                    return false;
                }
                p1++;
                p2--;
            } else if (!check(l)) {
                p1++;
            } else {
                p2--;
            }     
        }
        return true;
    }    
    public boolean check(char letter) {
        if (letter >= 48 && letter < 58) {
            return true;
        } else if (letter >= 97 && letter < 123) {
            return true;
        } else {
            return false;
        }
    }
}
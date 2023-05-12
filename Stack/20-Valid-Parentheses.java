/*
20. Valid Parentheses
Link: https://leetcode.com/problems/valid-parentheses/
Code by: Sam Lu
Language: Java
Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public boolean isValid(String s) {
        Stack <String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String par = s.substring(i, i + 1);
            if ("({[".contains(par)) {
                stack.push(par);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                if (par.equals(")") && stack.peek().equals("(")) {
                    stack.pop();
                } else if (par.equals("}") && stack.peek().equals("{")) {
                    stack.pop();
                } else if (par.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                } else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
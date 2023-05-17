/*
48. Rotate Image
Link: https://leetcode.com/problems/rotate-image/
Code by: Sam Lu
Language: Java
Time Complexity: O(n^2)
Space Complexity: O(1)
*/
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int r = 0; r < (n + 1) / 2; r++) {
            for (int c = 0; c < (n + 1) / 2; c++) {
                int w = matrix[r][c];
                int x = matrix[c][n-r-1];
                int y = matrix[n-r-1][n-c-1];
                int z = matrix[n-c-1][r];
                if (n % 2 == 0 || r != n/2)
                {
                    matrix[c][n-r-1] = w;
                    matrix[n-r-1][n-c-1] = x;
                    matrix[n-c-1][r] = y;
                    matrix[r][c] = z;
                }
               
            }
        }
    }
}
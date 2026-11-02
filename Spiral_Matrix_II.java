/*59. Spiral Matrix II

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

*/

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        int element = 0;

        while(left <= right){
            for(int j = left; j <= right; j++) {
                matrix[top][j] = element + 1;
                element++;
            }
            top++;

            for(int i = top; i <= bottom; i++){
                matrix[i][right] = element + 1;
                element++;
            }
            right--;

            if(top <= bottom){
                for(int j = right; j >= left; j--){
                     matrix[bottom][j] = element + 1;
                     element++;
                }
                    bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                 matrix[i][left] = element + 1;
                 element++;
                }
                left++;
            }
        }
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result[i][j] = matrix[i][j];
            }
        }
        return result;
    }
}

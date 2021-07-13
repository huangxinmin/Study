public class study_77 {
    class Solution {
        public boolean isToeplitzMatrix (int[][] matrix) {
            int n = matrix.length, m = matrix[0].length;
            for (int i = 1; i < n; i++) {
                for (int j = 1; i < m; j++) {
                    //判断矩阵中每个元素与左上角元素是否相等
                    if (matrix[i][j] != matrix[i - 1][j - 1]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}


public class ToeplitzMatrix766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != matrix[row - 1 - i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

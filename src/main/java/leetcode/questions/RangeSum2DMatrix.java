package leetcode.questions;

// https://leetcode.com/problems/range-sum-query-2d-immutable/
public class RangeSum2DMatrix {

    private int[][] processedMatrix;

    public RangeSum2DMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        processedMatrix = new int[matrix.length][matrix[0].length + 1];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                processedMatrix[r][c + 1] = processedMatrix[r][c] + matrix[r][c];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int row = row1; row <= row2; row++) {
            sum += processedMatrix[row][col2 + 1] - processedMatrix[row][col1];
        }
        return sum;
    }

    // BELOW APPROACH IS CORRECT BUT IT IS TAKE TOO MUCH TIME
   /* int[][] matrix;

    public RangeSum2DMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i < row2 + 1; i++) {
            for (int j = col1; j < col2 + 1; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }*/



}

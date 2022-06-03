package leetcode.questions;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;//rows
        int n = matrix[0].length;//columns
        int[][] transposed = new int[n][m];

        for (int i=0;i< m;i++)
        {
            for (int j=0;j<n;j++)
            {
                transposed[j][i]=matrix[i][j];
            }
        }
        return transposed;
    }
}

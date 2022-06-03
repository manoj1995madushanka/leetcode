package leetcode.main;

import leetcode.questions.RangeSum2DMatrix;
import leetcode.questions.TransposeMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*TransposeMatrix tm = new TransposeMatrix();
        int[][] in1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] out1 = tm.transpose(in1);
        System.out.println(Arrays.deepToString(in1));
        System.out.println(Arrays.deepToString(out1));*/

        RangeSum2DMatrix matrix = new RangeSum2DMatrix(new int[][]{{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}});
        System.out.println(matrix.sumRegion(2, 1, 4, 3));
        System.out.println(matrix.sumRegion(1, 1, 2, 2));
        System.out.println(matrix.sumRegion(1, 2, 2, 4));

        //[[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]
    }
}

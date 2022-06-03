package leetcode.main;

import leetcode.questions.TransposeMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TransposeMatrix tm = new TransposeMatrix();
        int[][] in1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] out1 = tm.transpose(in1);
        System.out.println(Arrays.deepToString(in1));
        System.out.println(Arrays.deepToString(out1));
    }
}

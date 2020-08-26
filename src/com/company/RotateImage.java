package com.company;

public class RotateImage {
    public static void rotate(int[][] matrix) {
        int length = matrix[0].length;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length-i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][length-i-1];
                matrix[j][length-i-1] = temp;
            }
        }
    }
}

package TwoDimensionalArrays;

import java.util.Scanner;

public class MatrixMultiplicationAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st matrix row : ");
        int row1 = sc.nextInt();

        System.out.print("Enter 1st matrix column : ");
        int col1 = sc.nextInt();

        int[][] mat1 = new int[row1][col1];
        System.out.println("Enter 1st Matrix");
        for (int i = 0; i < row1; i++){
            for (int j = 0; j < col1; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter 2nd matrix row : ");
        int row2 = sc.nextInt();

        System.out.print("Enter 2nd matrix column : ");
        int col2 = sc.nextInt();

        int[][] mat2 = new int[row2][col2];
        System.out.println("Enter 2nd Matrix");
        for (int i = 0; i < row2; i++){
            for (int j = 0; j < col2; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        if (col1 != row2){
            System.out.println("Multiplication is not possible");
        }
        else {
            int[][] mat3 = new int[row1][col2];

            for (int i = 0; i < row1; i++){
                for (int j = 0; j < col2; j++){
                    for (int k = 0; k < row2; k++){
                        mat3[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }

            System.out.println("Matrix Multiplication");
            for (int[] a : mat3){
                for (int ele : a){
                    System.out.print(ele + " ");
                }
                System.out.println();
            }
        }
    }
}
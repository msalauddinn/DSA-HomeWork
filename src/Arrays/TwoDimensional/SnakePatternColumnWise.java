package Arrays.TwoDimensional;

import java.util.Scanner;

import static Arrays.TwoDimensional.ReverseRowsThenReverseColumns.print;

public class SnakePatternColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter columns : ");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        System.out.println("Enter Array elements");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Array");
        print(arr);

        System.out.println("Snake Print");
        for (int j = 0; j < arr[0].length; j++){
            if (j % 2 == 0){
                for (int i = 0; i < arr.length; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int i = arr.length-1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

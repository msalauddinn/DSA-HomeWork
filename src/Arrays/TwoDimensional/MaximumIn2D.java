package Arrays.TwoDimensional;

import java.util.Scanner;

public class MaximumIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter no of columns : ");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        System.out.println("Enter Array elements : ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("You entered");
        for (int[] a : arr){
            for (int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE;

        for (int[] a : arr){
            for (int ele : a){
                if (ele > max) max = ele;
            }
        }
        System.out.println("Maximum element is : " + max);
    }
}

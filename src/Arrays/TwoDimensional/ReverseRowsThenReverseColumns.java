package Arrays.TwoDimensional;

import java.util.Scanner;

public class ReverseRowsThenReverseColumns {
    public static void print(int[][] arr){
        for (int[] a : arr){
            for (int ele : a){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

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

        //          Method : 1
        // reverse rows
//        for (int i = 0; i < arr.length; i++){
//            int j = 0, k = arr[0].length-1;
//            while (j < k){
//                int temp = arr[i][j];
//                arr[i][j] = arr[i][k];
//                arr[i][k] = temp;
//                j++;
//                k--;
//            }
//        }
//        System.out.println("After Row reversed");
//        print(arr);
//
//        System.out.println(arr.length);
//
//        // column reverse
//        for (int j = 0; j < arr[0].length; j++){
//            int i = 0, k = arr.length-1;
//
//            while (i < k) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[k][j];
//                arr[k][j] = temp;
//                i++;
//                k--;
//            }
//        }
//        System.out.println("After column reversed");
//        print(arr);

        //          METHOD : 2

        for (int i = 0; i < (rows + 1) / 2; i++){
            for (int j = 0; j < col; j++){

                if (i == rows-i-1 && j >= col/2) break;
                int temp = arr[i][j];
                arr[i][j] = arr[rows-1-i][col-1-j];
                arr[rows-1-i][col-1-j] = temp;
            }
        }
        System.out.println("After reversed");
        print(arr);
    }
}

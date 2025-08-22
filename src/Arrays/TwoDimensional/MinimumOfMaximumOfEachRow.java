package Arrays.TwoDimensional;

import java.util.Scanner;

public class MinimumOfMaximumOfEachRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row number : ");
        int row = sc.nextInt();

        System.out.print("Enter column number : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int rowMin = Integer.MAX_VALUE;
        for (int[] a : arr){
            int max = Integer.MIN_VALUE;
            for (int ele : a){
                if (ele > max) max = ele;
            }
            if (max < rowMin) rowMin = max;
        }
        System.out.println("Minimum of Maximum of Each row : " + rowMin);
    }
}

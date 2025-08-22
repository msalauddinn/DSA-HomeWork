package BasicSorting;

import java.util.Scanner;

public class MoveZeroes extends BubbleSort {

    public static void moveZeroes(int[] arr){
        int n = arr.length;

        for (int  i = 0; i < n-1; i++){
            boolean flag = true;
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] == 0 && arr[j+1] != 0){
                    flag = false;
                    swap(arr, j, j+1);
                }
            }
            if (flag) break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Element : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Original Array : ");
        print(arr);

        moveZeroes(arr);

        System.out.print("After moved zeroes : ");
        print(arr);
    }
}

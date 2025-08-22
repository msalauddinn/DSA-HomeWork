package BasicSorting;

import java.util.Scanner;

public class BubbleSortReverse extends BubbleSort {
    public static void reverseBubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            boolean isSorted = true;
            for (int j = n-1; j > i; j--){
                if (arr[j] < arr[j-1]){
                    isSorted = false;
                    swap(arr, j, j-1);
                }
            }
            if (isSorted) break;
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

        reverseBubbleSort(arr);

        System.out.print("Sorted Array : ");
        print(arr);
    }
}

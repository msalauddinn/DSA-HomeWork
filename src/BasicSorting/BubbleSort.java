package BasicSorting;

import java.util.Scanner;

public class BubbleSort {
    // print method
    public static void print(int[] arr){
        for (int ele : arr) System.out.print(ele + " ");
        System.out.println();
    }
    // swapping two elements
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        // no of passes
        for (int i = 0; i < n - 1; i++){
            // inner loop is check adjacent elements
            boolean isSorted = true; // assuming that array is sorted
            for (int j = 0; j < n-1-i; j++){
                if (arr[j] > arr[j+1]){
                    // now swap adjacent elements
                    isSorted = false; // if j-th element is greater of (j+1)-th element then array is not sorted
                    swap(arr, j, j+1);
                }
            }
            if (isSorted) break;
        }
        System.out.print("After sorting : ");
        print(arr);
    }
}

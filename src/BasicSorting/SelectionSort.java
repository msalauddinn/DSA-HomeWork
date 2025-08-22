package BasicSorting;

import java.util.Scanner;

public class SelectionSort extends BubbleSort{

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++){ // outer loop counts number of passes
            // inner loop is for finding minimum and it's index
            int min = Integer.MAX_VALUE;
            int idx = -1; // -1 can't be index so it's safe
            for (int j = i; j < n; j++){
                if (arr[j] < min) {
                    min = arr[j];
                    idx = j;
                }
            }
            swap(arr, i, idx); // swapping first element and the smallest element
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

        selectionSort(arr);

        System.out.print("After Sorted : ");
        print(arr);
    }
}

package BasicSorting;

import java.util.Scanner;

public class InsertionSort extends BubbleSort{

    public static void insertionSort(int[] arr){
        int n = arr.length;

                // METHOD - 1

//        // outer loop is number of passes
//        for (int i = 0; i < n-1; i++){
//            // for traversing and checking
//            for (int j = i+1; j > 0; j--){
//                // inserting values using adjacent swap
//                if (arr[j] < arr[j-1]){
//                    swap(arr, j, j-1);
//                }
//                else break;
//            }
//        }

                // METHOD - 2
//        for (int i = 1; i < n; i++){
//            int j = i;
//            while (j > 0 && arr[j-1] > arr[j]){
//                swap(arr, j-1, j);
//                j--;
//            }
//        }

                // METHOD - 3
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
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

        insertionSort(arr);

        System.out.print("After sort : ");
        print(arr);
    }
}
package BasicSorting;

import java.util.Scanner;

public class SelectionSortLargest extends BubbleSort{

    public static void selectionSortFindLargest(int[] arr){
        int n = arr.length;
        for (int i = n-1; i > 0; i--){
            int max = Integer.MIN_VALUE;
            int idx = -1;
            for (int j = i; j >= 0; j--){
                if (arr[j] > max){
                    max = arr[j];
                    idx = j;
                }
            }
            swap(arr, i, idx);
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

        selectionSortFindLargest(arr);

        System.out.print("After Sorted : ");
        print(arr);
    }
}

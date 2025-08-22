package BinarySearch;

import java.util.Scanner;

public class SearchInDescendingOrder {

    public static int search(int[] arr, int x){
        int n = arr.length;

        int low = 0, high = n-1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] > x) low = mid + 1;
            else if (arr[mid] < x) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Element : ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter target : ");
        int x = sc.nextInt();

        System.out.println(search(arr,x));
    }
}

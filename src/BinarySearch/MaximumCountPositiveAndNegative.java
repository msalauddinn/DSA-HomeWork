package BinarySearch;

import java.util.Scanner;

public class MaximumCountPositiveAndNegative {

    public static int maxCount(int[] arr){
        int n = arr.length;

        int low = 0, high = n-1;
        int l = 0, h = n-1;
        int pos = 0, neg = 0;

        // count positive
        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] <= 0){
                low = mid + 1;
            }
            else{
                pos = n-mid;
                high = mid - 1;
            }
        }
        // count negative
        while (l <= h){
            int mid = (l + h) / 2;

            if (arr[mid] >= 0){
                h = mid - 1;
            }
            else{
                neg = mid + 1;
                l = mid + 1;
            }
        }
        return Math.max(pos, neg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array Element : ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(maxCount(arr));
    }
}

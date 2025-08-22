package BinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastOccurrence {

    public static ArrayList<Integer> firstAndLastOccurrenceOfAnElement(int[] arr, int x){
        int n = arr.length;
        int low = 0, high = n-1;

        int l = 0, h = n-1;

        ArrayList<Integer> ans = new ArrayList<>();
        int idx1 = -1, idx2 = -1;

        // first occurrence
        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] == x){
                idx1 = mid;
                high = mid - 1;
            }
            else if (arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        ans.add(idx1);

        // last occurrence
        while (l <= h){
            int mid = (l + h) / 2;

            if (arr[mid] == x){
                idx2 = mid;
                l = mid + 1;
            }
            else if (arr[mid] > x) h = mid - 1;
            else l = mid + 1;
        }
        ans.add(idx2);

        return ans;
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

        ArrayList<Integer> ans = firstAndLastOccurrenceOfAnElement(arr, x);

        for (int ele : ans) System.out.print(ele + " ");
        System.out.println();
    }
}

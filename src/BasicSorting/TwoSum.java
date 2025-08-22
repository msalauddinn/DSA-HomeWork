package BasicSorting;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static boolean isPairExist(int[] arr, int target){
        int n = arr.length;
        if (n <= 1) return false;

        Arrays.sort(arr);

        int i = 0, j = n - 1;

        while (i < j){
            if (arr[i] + arr[j] == target) return true;
            else if (arr[i] + arr[j] > target) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter Array Element : ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter target sum : ");
        int target = sc.nextInt();

        if (isPairExist(arr, target)) System.out.println("Pair exist");
        else System.out.println("Pair does not exist");
    }
}

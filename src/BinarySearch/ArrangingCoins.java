package BinarySearch;

import java.util.Scanner;

public class ArrangingCoins {

    public static int rowCount(int n){
        int low = 1, high = n;
        int ans = 0;

        if (n == 0) return 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long ballCount = ((long) mid * (mid + 1)) / 2;

            if (ballCount == n) return mid;
            else if (ballCount < n){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println("Output : " + rowCount(n));
    }
}

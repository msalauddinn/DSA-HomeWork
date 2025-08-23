package BasicSorting;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElementsBruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Array Size : ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];
        System.out.print("Enter Array Element : ");
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter 2nd Array Size : ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];
        System.out.print("Enter Array Element : ");
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        ArrayList<Integer> ans = commonElements(a, b);

        for (int ele : ans){
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> commonElements(int[] a, int[] b){
        ArrayList<Integer> ans = new ArrayList<>();

        int lastEle = Integer.MIN_VALUE;

        for (int k : a) {
            for (int i : b) {
                if (k == i && lastEle != k) {
                    lastEle = k;
                    ans.add(k);
                    break;
                }
            }
        }
        return ans;
    }
}

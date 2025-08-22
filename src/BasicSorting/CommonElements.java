package BasicSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {

    public static ArrayList<Integer> commonElements(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < n1 && j < n2){
            if (a[i] == b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] > b[j]) j++;
            else i++;
        }
        return ans;
    }

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
}
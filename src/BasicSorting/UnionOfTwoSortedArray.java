package BasicSorting;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfTwoSortedArray {

        public static ArrayList<Integer> findUnion(int[] a, int[] b) {
            int n = a.length;
            int m = b.length;

            ArrayList<Integer> ans = new ArrayList<>();

            int i = 0, j = 0;
            int lastEle = Integer.MIN_VALUE;

            //   METHOD - 1
//            while (i < n && j < m){
//                if (a[i] > b[j]){
//                    if (lastELe != b[j]){
//                        ans.add(b[j]);
//                        lastELe = b[j];
//                    }
//                    j++;
//                }
//                else if (a[i] < b[j]){
//                    if (lastELe != a[i]){
//                        ans.add(a[i]);
//                        lastELe = a[i];
//                    }
//                    i++;
//                }
//                else {
//                    if (lastELe != a[i]){
//                        ans.add(a[i]);
//                        lastELe = a[i];
//                    }
//                    i++;
//                    j++;
//                }
//            }
//            while (i < n){
//                if (lastELe != a[i]){
//                    ans.add(a[i]);
//                    lastELe = a[i];
//                }
//                i++;
//            }
//            while (j < m){
//                if (lastELe != b[j]){
//                    ans.add(b[j]);
//                    lastELe = b[j];
//                }
//                j++;
//            }
//            return ans;

            //    METHOD - 2
            while (i < n || j < m){
                int x;

                if (j < m && (i >= n ||a[i] > b[j])) x = b[j++];
                else if (j >= m || a[i] < b[j]) x = a[i++];
                else {
                    x = a[i];
                    i++;
                    j++;
                }
                if (lastEle != x){
                    ans.add(x);
                    lastEle = x;
                }
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

        ArrayList<Integer> ans = findUnion(a, b);
        for (int ele : ans){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

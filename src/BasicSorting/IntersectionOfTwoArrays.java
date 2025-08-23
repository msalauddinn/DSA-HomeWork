package BasicSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    
    public static int[] interSection(int[] a, int[] b){
        int n = a.length;
        int m = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0, k = 0;
        int lastEle = Integer.MIN_VALUE;
        while (i < n && j < m){
            if(a[i] > b[j]){
                j++;
            }
            else if(a[i] < b[j]) i++;
            else {
                if (lastEle != a[i]){
                    ans.add(a[i]);
                    lastEle = a[i];
                }
                i++;
                j++;
            }
        }

        int[] res = new int[ans.size()];
        for(int l = 0; l < ans.size(); l++){
            res[l] = ans.get(l);
        }
        return res;
    }
    
    public static void main(String[] args) {
        
    }
}

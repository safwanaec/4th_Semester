package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Subsequence_Update {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int n, l, k,test = t;
        int[] arr;
        int[] ans = new int[t];
        while (t>0) {
            n=inp.nextInt();
            l=inp.nextInt();
            k=inp.nextInt();
            arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = inp.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0; i<k-l+1; i++){
                ans[test-t]+=arr[i];
            }
            t--;
        }
        for(int i=0; i<test; i++){
            
            System.out.println(ans[i]);
        }
        inp.close();
    }
}

package codeforces;

import java.util.Scanner;

public class Minimal_Coprime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int l,k,ans;
        while (t > 0) {
            l=inp.nextInt();
            k=inp.nextInt();
            ans = k-l;
            if(k==1&&l==1) ans++;
            System.out.println(ans);
            t--;
        }
        inp.close();
    }

}

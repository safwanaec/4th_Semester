package codeforces;

import java.util.Scanner;

public class Clockwork{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int n;
        int tmp;
        boolean acc = true;
        while (t>0) {
            t--;
            n=inp.nextInt();
            if(n == 1){
                tmp = inp.nextInt();
                if(tmp>1) System.out.println("YES");
                else System.out.println("NO");
                continue;
            }
            acc = true;
            for(int i=0; i<n; i++){
                tmp=inp.nextInt();
                if(acc && tmp<Math.max(n-1-i, i)*2+1){
                    System.out.println("NO");
                    acc = false;
                }
            }
            if(!acc)continue;
            System.out.println("YES");
        }
        inp.close();
    }
}
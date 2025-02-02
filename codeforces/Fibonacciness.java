package codeforces;

import java.util.Scanner;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int t = inp.nextInt();

        int[] arr = new int[5];
        int o, t1,t2;

        while (t>0) {
            o=0;
            t1=0;
            t2=0;
            for(int i=0; i<5; i++){
                if(i==2) continue;
                else arr[i] = inp.nextInt();
            }
            arr[2]=arr[3]-arr[1];
            t1=arr[0]+arr[1];
            t2=arr[4]-arr[3];
            if(t1==t2)arr[2]=t1;
            for(int i=2; i<5; i++){
                if(arr[i-1]+arr[i-2]==arr[i])o++;
            }
            System.out.println(o);
            t--;
        }
        inp.close();
    }
}

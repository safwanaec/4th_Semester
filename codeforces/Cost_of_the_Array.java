package codeforces;

import java.util.Scanner;

public class Cost_of_the_Array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int n,k,x,p;
        int[] a;
        while (t>0) {
            n = inp.nextInt();
            k=inp.nextInt();
            if(n%2==0){
                a=new int[n+2];
                a[n+1]=0;
            }
            else{
                a = new int[n+1];
                a[n]=0;
            } 

            for(int i=0; i<n; i++){
                a[i] = inp.nextInt();
            }
            x=n-k;
            p = k+x;
            for(int i=0,j=0; i<a.length&&j<p; i++){
                if(x>0){
                    x--;
                }
                else if(i+1%2!=0)continue;
                if(a[i]!=j){
                    if(i==0)System.out.println(1);
                    else System.out.println(i);
                    break;
                }
            }
            
            t--;

        }
        inp.close();
    }
}

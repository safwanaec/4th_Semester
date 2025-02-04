package codeforces;

import java.util.Scanner;
import java.util.Stack;

public class Milya_and_Two_Arrays{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int n;
        int[] a,b;
        while (t>0) {
            n = inp.nextInt();
            a=new int[n];
            b=new int[n];
            Stack<Integer> s = new Stack<>();
            Stack<Integer> sa = new Stack<>();
            Stack<Integer> sb = new Stack<>();
            for(int i=0; i<n; i++){
                a[i] = inp.nextInt();
                if(s.isEmpty() || !s.contains(a[i])) {
                    s.push(a[i]);
                }
                if(sa.isEmpty() || !sa.contains(a[i])){
                    sa.push(a[i]);
                }
            }
            for(int j=0; j<n; j++){
                b[j] = inp.nextInt();
                if(s.isEmpty() || !s.contains(b[j])){
                    s.push(b[j]);
                }
                if(sb.isEmpty() || !sb.contains(b[j])){
                    sb.push(b[j]);
                }
            }

            if(sa.size()+sb.size()>3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            t--;
        }
        inp.close();
    }
}
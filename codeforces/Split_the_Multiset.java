package codeforces;

import java.util.Scanner;
import java.util.Stack;

public class Split_the_Multiset {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int n;
        int k;
        int o;
        int temp;
        Stack<Integer> st1;
        for (int i = 0; i < t; i++) {
            o = 0;
            n = inp.nextInt();
            k = inp.nextInt();
            st1 = new Stack<>();

            for(int j=0; j<n; j++){
                st1.push(1);
            }

            while (st1.size()!=1) {
                temp = 0;
                for(int j=0; j<k && !st1.isEmpty(); j++){
                    temp+=st1.pop();
                }
                st1.push(temp);
                o++;
            }
            
            System.out.println(o);
        }
        inp.close();
    }
}

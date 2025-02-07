package codeChef;

import java.util.*;
public class SMLPAL {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int x,y;
        while(t>0){
            x = inp.nextInt();
            y=inp.nextInt();
            if(x!=0){
                for(int i=0; i<x/2; i++){
                    System.out.print(1);
                }
            }
            while(y>0){
                System.out.print(2);
                y--;
            }
            if(x!=0){
                for(int i=0; i<x/2; i++){
                    System.out.print(1);
                }
            }
            System.out.println();
            t--;
        }
        inp.close();
    }
}
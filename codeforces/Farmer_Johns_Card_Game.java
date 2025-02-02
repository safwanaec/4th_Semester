package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Farmer_Johns_Card_Game {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        int m,n,target = 0;
        int[][] cards,c;
        int[] o;
        boolean valid = true;
        while (t>0) {
            n = inp.nextInt();
            m = inp.nextInt();
            cards = new int[n][m];
            c = new int[n][m];
            o = new int[n];
            target = 0;
            valid=true;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    cards[i][j] = inp.nextInt();
                }
                c[i] = Arrays.copyOf(cards[i], m);
                Arrays.sort(c[i]);
            }
            Arrays.sort(c,(a,b)->Integer.compare(a[0], b[0]));
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(c[j][i]==target) target++;
                    else {
                        valid=false;
                        break;
                    }
                    if(i==0) o[cards[j][i]%n]=target;
                }
                if(!valid)break;
            }
            if(valid){
                for(int i=0; i<o.length; i++){
                    System.out.print(o[i]+" ");
                }
                System.out.println();
            }
            else System.out.println(-1);
            t--;
        }
        inp.close();
    }
}

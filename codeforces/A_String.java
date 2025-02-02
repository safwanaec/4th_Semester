package codeforces;

import java.util.Scanner;

public class A_String {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        String x;
        char[] chars = { '1', '0' };
        char[] xChar;
        int loop, p,lp;
        boolean done;
        while(t>0){
            x = inp.next();
            done = false;
            xChar = x.toCharArray();
            loop = 0;
            while (!done) {
                for (int i = 0; i < xChar.length; i++) {
                    if (xChar[i] == '1') {
                        break;
                    } else if (i == xChar.length - 1 && xChar[i] == '0') {
                        done = true;
                        break;
                    }
                }
                if (done)
                    break;
    
                p = 0;
                lp = -1;
                for (int i = 0; i < xChar.length; i++) {
                    if (xChar[i] == chars[p]) {
                        if (p == 0)
                            xChar[i] = chars[++p];
                        else
                            xChar[i] = chars[--p];
                        lp = i;
                    }
                }
                if(lp!=-1 && xChar[lp]==chars[0]) xChar[lp] = chars[1]; 
    
                loop++;
            }
            System.out.println(loop);
            t--;
        }
        inp.close();
    }
}

package codeChef;

import java.util.*;
import java.io.*;
public class  a1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = inp.nextInt();
        if(t<2025||t>2050)out.println("No");
        else out.println("Yes");
        
        out.close();
        inp.close();
    }
}
package codeChef;
import java.util.*;
import java.io.*;
public class StreakStar {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = inp.nextInt();
        int n,x,temp,ans,p;
        int[] arr;
        while(t>0){
            n = inp.nextInt();
            x = inp.nextInt();
            arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=inp.nextInt();
            }
            temp=0;
            ans=0;
            p=0;

            for(int i=0; i<arr.length; i++){
                if(i==0)temp++;
                else if(arr[i]>arr[i-1]){
                    temp++;
                    if(ans<temp)ans=temp;
                }
                else if(p==0 && arr[i]*x>arr[i-1]){
                    temp++;
                    if(ans<temp)ans=temp;
                    p=i;
                }
                else{
                    i=p+1;
                    p=0;
                    temp=1;
                }
            }
            out.println(ans);

            t--;
        }
        out.close();
        inp.close();
    }
}

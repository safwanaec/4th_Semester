import java.util.Scanner;

public class LongestSub {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s=inp.nextLine();
        String temp="";
        int currcount=0,maxCount=0,starter = 0;

        for(int i=starter; i<s.length(); i++){
            if(!temp.contains(Character.toString(s.charAt(i)))){
                currcount++;
                temp+=s.charAt(i);
            }
            else{
                temp="";
                currcount=0;
                i=starter++;
            }
            if(maxCount<currcount)maxCount=currcount;
        }
        
        System.out.println(maxCount);
        inp.close();
    }
}

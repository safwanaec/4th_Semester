import java.util.Stack;

class braces {
    public boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int pointer = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                arr[pointer] = s.charAt(i);
            }
        }
    }
}
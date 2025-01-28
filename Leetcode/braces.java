class braces {
    public static void main(String[] args) {
        System.out.println(isValid("])"));
    }
    public static boolean isValid(String s) {
        char[] arr = new char[s.length()];
        int pointer = 0;
        char[] op = {'(','{','['};
        char[] cl = {')','}',']'};
        if(s.length()%2!=0) return false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == op[0] || s.charAt(i) == op[1] || s.charAt(i) == op[2]){
                arr[pointer++] = s.charAt(i);
            }
            else if(s.charAt(i) == cl[0] || s.charAt(i) == cl[1] || s.charAt(i) == cl[2]){
                arr[pointer] = s.charAt(i);
                if(pointer == 0 || arr[pointer]==cl[0] && arr[pointer-1]!=op[0] || arr[pointer]==cl[1] && arr[pointer-1]!=op[1] || arr[pointer]==cl[2] && arr[pointer-1]!=op[2]){
                    return false;
                }
                pointer--;
            }
        }
        if(pointer!=0) return false;
        else return true;
    }
}
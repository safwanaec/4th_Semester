package codeforces;

public class A_String {
    public static void main(String[] args) {
        String x = "10101";
        char[] xChar = x.toCharArray();
        char[] yChar = x.toCharArray();
        int ascii = '0' * x.length();
        int loop = 0;
        int Sascii = 0;
        for (int i = 0; i < xChar.length; i++) {
            Sascii += xChar[i];
        }

        while (ascii != Sascii) {
            for (int i = 0; i < xChar.length; i++) {
                if (i==0 && xChar[i] == '1' && xChar[i] != xChar[i + 1]) {
                    yChar[i] = (yChar[i] == '0') ? '1' : '0';
                }
                else if (i == xChar.length - 1 && xChar[i] == '1' && xChar[i - 1] != xChar[i])
                    yChar[i] = (yChar[i] == '0') ? '1' : '0';
                else if (i!=0 && i != xChar.length - 1 && xChar[i-1]!=xChar[i]) {
                    yChar[i] = (yChar[i] == '0') ? '1' : '0';
                }
                
            }
            Sascii = 0;
            for (int i = 0; i < yChar.length; i++) {
                xChar[i] = yChar[i];
                Sascii += yChar[i];
            }
            loop++;
        }
        System.out.println(loop);
    }
}

package home;
import java.math.BigInteger;

public class sumonKhanki {

    public static void main(String[] args) {
        int n = 100000;
        long[] prime = new long[n];
        prime[0]=2;
        int pointer = 1,index=0;
        boolean isPime;
        for(long i=3; i<Long.MAX_VALUE && pointer<n; i+=2){
            index=0;
            isPime = true;
            while(prime[index]<=Math.sqrt(i) && isPime){
                if(i % prime[index]!=0) index++;
                else isPime=false;
            }
            if(isPime)prime[pointer++] = i;
        }
        for(int i=0; i<pointer; i++){
            System.out.println((int)prime[i]);
        }
        BigInteger base2 = new BigInteger("2");
        BigInteger num;
        int lastDigit;
        for(int i=0; i<pointer; i++){
            num = (base2.pow((int)prime[i]-1).multiply(base2.pow((int)prime[i]).subtract(new BigInteger("1"))));
            lastDigit = num.mod(BigInteger.TEN).intValue();
            if(lastDigit%2!=0){
                System.out.println(num);
            }
        }
    }
}
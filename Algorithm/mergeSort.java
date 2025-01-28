import java.util.Arrays;

public class mergeSort{
    public static void main(String[] args) {
        int[] arr = {1,8,8,2,8,6,8,7,1,4,6,2,5,44,6,99};
        arr = mergesort(arr, arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static int[] mergesort(int[] Array, int right) {
        int mid = (right) / 2;
        if (0 >= right - 1) {
            return Array;
        } else {
            int x = 0, y = 0, z = 0;
            int[] n1 = mergesort(Arrays.copyOfRange(Array, 0, mid),mid);
            int[] n2 = mergesort(Arrays.copyOfRange(Array, mid, Array.length),right-mid);

            while (x < n1.length && y < n2.length) {
                if (n1[x] > n2[y]) {
                    Array[z] = n2[y];
                    y++;
                } else {
                    Array[z] = n1[x];
                    x++;
                }
                z++;
            }
            while(x<n1.length)Array[z++]=n1[x++];
            while(y<n2.length)Array[z++]=n2[y++];
        }
        return Array;
    }
}
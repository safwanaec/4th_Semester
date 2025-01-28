public class countingSort {

    public static void main(String[] args) {
        int[] arr = {2,5,4,3,2,0,0,1,1,4,9};
        int max = arr[0];
        int[] output = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) max = arr[i];
        }
        int[] count = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        for(int i=1; i<count.length; i++){
            count[i]+=count[i-1];
        }
        for(int i=0; i<arr.length; i++){
            output[--count[arr[i]]] = arr[i];
        }
        for(int i=0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }
}
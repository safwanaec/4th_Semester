import java.util.Arrays;

public class sort{
    public static void main(String[] args) {
        int arr[] = {5,-2,10,-16,50,100,0,2,2,3,4,5,5,2,3,4,6,2,8};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sorted[] = arr;
        Arrays.sort(sorted);
        int max_freq = 0, curr_freq = 0, max_element=0;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
            else if(min>arr[i]){
                min = arr[i];
            }
            if(i>0 && arr[i] == arr[i-1]){
                curr_freq++;
                if(max_freq<curr_freq){
                    max_freq = curr_freq;
                    max_element = arr[i];
                }
            }
            else curr_freq = 1;
        }

        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array(Bubble Sort): ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nMax element is: "+max);
        System.out.println("Min element is: "+min);
        System.out.println("Max frequency element is: "+max_element+" with frequency: "+max_freq);
    }
}
public class countingSort {
    static void CountingSort(int[] arr){
        int max=0;
        int min=Integer.MAX_VALUE;

        //Calculates minimum and maximum value in array.
        for(int i=0; i<arr.length; i++){
            if(max<arr[i])max=arr[i];
            if(min>arr[i])min=arr[i];
        }

        //an array that keps count of every element in `arr` and it's frequency in `arr`
        int[] count = new int[max+1];

        //increasing the frequency of each element of `arr`
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //since we dont need to start from 0 in the `count` array if the smallest value isn't 0, we start from `min`
        //and working our way upto the lenght of `count`-1 which is essentialy `max` would cover all elements and their frequencies

        for(int i=0,j=min; i<arr.length&&j<count.length; i++){
            if(count[j]>0){
                arr[i] = j;                                     //we store the index of `count` which is the value of `arr` we need to sort, in `arr`.
                count[j]--;
                if(count[j]==0)j++;
            }
            else
            {
                j++;
                i--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={3,8,9,4,2};
        CountingSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}

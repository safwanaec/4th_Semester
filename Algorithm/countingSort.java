public class countingSort {
    static void CountingSort(int[] arr){
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i])max=arr[i];
            if(min>arr[i])min=arr[i];
        }

        int[] count = new int[max+1];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        for(int i=0,j=min; i<arr.length&&j<count.length; i++){
            if(count[j]!=0){
                arr[i] = j;
                count[j]--;
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
        System.out.println();
    }
}
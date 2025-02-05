import java.util.Arrays;
public class mergeSort{
    public static void main(String[] args) {
        int[] arr = {1,8,8,2,8,6,8,7,1,4,6,2,5,44,6,99};
        arr = mergesort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static int[] mergesort(int[] Array) {
        int mid = (Array.length) / 2;
        if (Array.length<=1) {
            return Array;
        } else {
            int leftArrayIndex = 0, rightArayIndex = 0, arrayIndex = 0;
            int[] leftArray = mergesort(Arrays.copyOfRange(Array, 0, mid));
            int[] rightArray = mergesort(Arrays.copyOfRange(Array, mid, Array.length));

            while (leftArrayIndex < leftArray.length && rightArayIndex < rightArray.length) {
                if (leftArray[leftArrayIndex] > rightArray[rightArayIndex]) {
                    Array[arrayIndex] = rightArray[rightArayIndex];
                    rightArayIndex++;
                } else {
                    Array[arrayIndex] = leftArray[leftArrayIndex];
                    leftArrayIndex++;
                }
                arrayIndex++;
            }
            while(leftArrayIndex<leftArray.length)Array[arrayIndex++]=leftArray[leftArrayIndex++];
            while(rightArayIndex<rightArray.length)Array[arrayIndex++]=rightArray[rightArayIndex++];
        }
        return Array;
    }
}
package codeforces;

public class Kevin_and_Geometry {
    public static void main(String[] args) {
        int[] sides;
        int p=0;
        sides = new int[4];
        int[] arr = {1,1,2,3,4};
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]==arr[j]) {
                    sides[p++] = arr[i];
                    sides[p++] = arr[j];
                    break;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]==arr[j] && arr[i]!=sides[0]) {
                    sides[p++] = arr[i];
                    sides[p++] = arr[j];
                    break;
                }
            }
        }

        if(sides[2]!=0){
            
        }
    }
}

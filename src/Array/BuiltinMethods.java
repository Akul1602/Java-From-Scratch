package Array;

import java.util.Arrays;

public class BuiltinMethods {
    public static void main(String[] args) {
        int[] arr = {30,10,25,16,58};
        //for Each Loop
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

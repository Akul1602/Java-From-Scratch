package Array;

import java.util.Scanner;

public class OutputofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        //input-> loop
        for (int i = 0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }

        //output -> loop
        for (int i = 0; i<=n-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
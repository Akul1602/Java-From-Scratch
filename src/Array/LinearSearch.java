package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Target Element: ");
        int x = sc.nextInt();
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //solution
        boolean flag = false; //means not found
        for(int i = 0; i<n;i++){
            if(arr[i]==x) {
                flag = true;//true means found
                break;
            }
        }

        if (flag==true) System.out.println("Element Found");
        else System.out.println("Element not found");
    }
}

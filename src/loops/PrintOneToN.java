package loops;

import java.util.Scanner;

public class PrintOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        for(int r=1; r<=n; r++)
        {
            System.out.println(r);
        }
    }
}

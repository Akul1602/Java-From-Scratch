package loops;

import java.util.Scanner;

public class printOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for(int r=1; r<=n; r++)
        {
            if (r%2 != 0) System.out.println(r);
        }
    }
}

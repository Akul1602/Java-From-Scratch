package loops;

import java.util.Scanner;

public class Divisibleby3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for(int r=1; r<=n; r++)
        {
            if (r%3 == 0 || r%5 ==0) System.out.println(r);
        }
    }
}

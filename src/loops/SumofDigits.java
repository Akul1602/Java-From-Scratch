package loops;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n!=0){
            int ld = n%10;
            sum += ld;
            n/=10;
        }
        System.out.println(sum);

    }
}

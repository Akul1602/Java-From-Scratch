package Conditionals;

import java.util.Scanner;

public class FiveorThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n%3 == 0 || n%5 ==0)
            System.out.println("It is Divisible by 5 or 3");
        else
            System.out.println("It is not divisible by 5 or 3");


    }
}

package Conditionals;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Side: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Side: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Side: ");
        int c = sc.nextInt();

        if ((a+b)>c && (b+c)>a && (c+a)>b)
            System.out.println("It is a Valid Triangle");
        else
            System.out.println("It is an Invalid Triangle");

    }
}

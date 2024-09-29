package Conditionals;

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        if(n>99 && n<1000)
            System.out.println("It is a 3 digit Number");
        else
            System.out.println("It is not a 3 digit Number");




    }
}

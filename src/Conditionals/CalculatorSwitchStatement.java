package Conditionals;

import java.util.Scanner;

public class CalculatorSwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.println("Enter the operation: ");
        char op = sc.next().charAt(0);

        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();

        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case  '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}

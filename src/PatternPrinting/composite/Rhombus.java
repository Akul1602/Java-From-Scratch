package PatternPrinting.composite;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {//rows
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= m; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
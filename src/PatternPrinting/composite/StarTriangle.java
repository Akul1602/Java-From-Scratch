package PatternPrinting.composite;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and cols : ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {//rows
            for (int j = 1; j <= m-i; j++) {
                System.out.print("#" + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

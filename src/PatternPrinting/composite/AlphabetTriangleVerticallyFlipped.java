package PatternPrinting.composite;

import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {//rows
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}

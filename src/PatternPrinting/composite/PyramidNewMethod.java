package PatternPrinting.composite;

import java.util.Scanner;

public class PyramidNewMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int m = sc.nextInt();

        int nsp = m-1;
        int nst = 1;

        for (int i = 1; i <= m; i++) {//rows
            for (int j = 1; j <= nsp; j++) {//spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {//stars
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
    }
}

package PatternPrinting.squares;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and cols : ");
        int m = sc.nextInt();
        for(int i=1;i<=m;i++) {//rows
            for (int j = 1; j <= m; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}

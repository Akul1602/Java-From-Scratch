package PatternPrinting.squares;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int m = sc.nextInt();
        for(int i=1;i<=m;i++) {//rows
            for (int j = 1; j <= m; j++) { //columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

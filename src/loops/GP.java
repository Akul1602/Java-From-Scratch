package loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        //1 3 9 27
        int a = 1;
        for(int i = 1; i<=n;i++){
            System.out.println(a);
            a *= 3;
        }
    }
}

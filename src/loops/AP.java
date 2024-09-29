package loops;

import java.util.Scanner;

public class AP { //Arithmetic Progression
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        //1 3 5 7 9 .....
        //using AP Formula
//        for(int i = 1; i<=2*n-1; i+=2){
//            System.out.println(i);
//        }//n rounds

        //4 7 10 13......
        int a = 4, d = 3;
        for (int i = 1; i<=n; i++){
            System.out.println(a);
            a += d;
        }
    }
}

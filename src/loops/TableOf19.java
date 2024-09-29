package loops;

import java.util.Scanner;

public class TableOf19 {
    public static void main(String[] args) {
        //bekar Code
        // as it is running 171 rounds
//        for(int r=19; r<=190; r+=1)
//        {
//            if (r%19 == 0) System.out.println(r);
//        }

        // Better Code
        //Running 10 Rounds Only
        //rounds/iterations ==>
        //Number of times 'r' changes its value
        for(int r=19; r<=190; r+=19)
        {
            if (r%19 == 0) System.out.println(r);
        }
    }
}

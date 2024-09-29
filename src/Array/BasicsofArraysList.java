package Array;

import java.util.ArrayList;

public class BasicsofArraysList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10); //arr[0] = 10
        arr.add(1,20);//initialize
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
//        System.out.println(arr);
        for (int i=0;i<=5;i++){
            System.out.print(arr.get(i) + " ");//print
        }
        System.out.println();
        arr.set(2,300); //modify
        System.out.println(arr);
        arr.add(90); //push back
        System.out.println();
        System.out.println(arr);
    }
}

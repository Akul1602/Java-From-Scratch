package Array;

public class basicSyntax {
    public static void main(String[] args) {
        int[] arr =  new int[5];
        //initialising individual elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //Output of Array Elements
        System.out.println(arr[0] + " ");
        System.out.println(arr[1] + " ");
        System.out.println(arr[2] + " ");
        System.out.println(arr[3] + " ");
        System.out.println(arr[4] + " ");
        //update
        arr[0] = 99;
        arr[0] += 10;
        System.out.println(arr[0] + " ");

    }
}

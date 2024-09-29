package Array;

public class PassingArraysToMethods {
    public static void main(String[] args) {
        int[] arr ={5,10,12,34,32,12,23,43,45,76};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int[] arr) {
        arr[0] = 90;
    }

}

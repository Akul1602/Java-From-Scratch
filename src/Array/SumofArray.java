package Array;

public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,9,45,32,56,22,56};
        int sum = 0;
        for(int i = 0; i<arr.length; i++ ){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
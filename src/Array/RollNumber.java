package Array;

public class RollNumber {
    public static void main(String[] args) {
        int[] arr = {66,58,64,31,23,67,45,34,21,87};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]<35)
                System.out.print(i + " ");
        }
    }
}

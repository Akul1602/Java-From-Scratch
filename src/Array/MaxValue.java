package Array;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {10,5,76,98,53,114,90,88};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 1;i<n;i++){
            //if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}

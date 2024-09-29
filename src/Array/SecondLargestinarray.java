package Array;

public class SecondLargestinarray {
    public static void main(String[] args) {
        int[] arr = {10,5,76,98,53,114,90,88};
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 1;i<n;i++){
            //if(arr[i]>mx) mx = arr[i];
            mx = Math.max(mx,arr[i]);
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0;i<n;i++){
            if(arr[i] != mx)
                smx = Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}

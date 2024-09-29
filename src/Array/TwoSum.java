package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,1,8,5,6,7,2,4,8,9,0};
        int x = 9;
        int n = arr.length;
        // Solution
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i] + " "+ arr[j]);
                    //break;
                }
            }
        }
    }
}

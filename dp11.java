import java.util.*;
public class dp11 {
    //Minimum partitionong
   //min subset sum differenec
   //partitiong subset

    public static int minPart(int arr[]){
        int n = arr.length;
        int sum = 0;
        for( int i = 0 ; i < arr.length;i++){
            sum +=arr[i];
        }

        int W = sum/2;

        int dp[][] = new int [n+1][W+1];

        //bottom up
        for( int i = 1;i<n+1;i++){
            for( int j = 1; j < W+1 ;j++){
                if( arr[i-1] <= j){
                    dp[i][j] = Math.max(arr[i-1] + dp[i-1][j-arr[i-1]], dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        // if( sum1 == W){
        //     System.out.println("true");
        // }
        int sum2 = sum - sum1;
        return Math.abs(sum1-sum2);
    }

    // MinArray Jumps
    public static int minArrayJump(int arr[]){
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        dp[n-1] = 0;

        for( int i = n-2 ;i >=0;i--){
            int steps= arr[i];
            int ans= Integer.MAX_VALUE;
            for( int j =i+1 ; j<=i+steps && j<n; j++ ){
                if(dp[j]!=-1){
                    ans = Math.min(ans,dp[j]+1);
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[i] = ans;
            }
        }
        return dp[0];
    }




public static void main(String agrs[]){
    int num[] = { 1,6,11,5};
    System.out.println(minPart(num));

    int arr[] = {2,3,1,1,4};
    System.out.println(minArrayJump(arr));
}
}

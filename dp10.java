// Matrix chain multiplication
import java.util.*;
public class dp10 {
    // recursion
    public static int mcm(int arr[], int i , int j){
        if( i==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;

        for( int k = i ; k<=j-1;k++){
            int cost1 = mcm(arr,i,k);   //ai...ak=>arr[i-1]xarr[k]
            int cost2 = mcm(arr,k+1,j);   //ak+1...aj=>arr[k]xarr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 +cost3;
            ans = Math.min(ans,finalCost);
        }
        return ans;
    }
    // memorization
    public static int memmcm(int arr[], int i , int j,int dp[][]){
        if( i==j){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        if(dp[i][j] !=-1){
            return dp[i][j];
        }

        for( int k = i ; k<=j-1;k++){
            int cost1 = mcm(arr,i,k);   //ai...ak=>arr[i-1]xarr[k]
            int cost2 = mcm(arr,k+1,j);   //ak+1...aj=>arr[k]xarr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 +cost3;
            ans = Math.min(ans,finalCost);
        }
        return dp[i][j] =ans;
    }
    // tabulation
    public static int tabmcm(int arr[]){
        int n = arr.length;
        int dp[][]= new int[n][n];

        // intilaise
        for( int i = 0 ;i< n;i++){
            dp[i][i]= 0;
        }
        //bottom up 
        for( int len = 2; len <= n-1;len++){
            for( int i =1 ; i<= n-len ;i++){
                int j = i+len -1;
                dp[i][j] = Integer.MAX_VALUE;
                for( int k =i ; k<=j-1;k++){
                int cost1 = dp[i][k];   //ai...ak=>arr[i-1]xarr[k]
                int cost2 = dp[k+1][j];   //ak+1...aj=>arr[k]xarr[j]
                int cost3 = arr[i-1] * arr[k] * arr[j];
                int finalCost = cost1 + cost2 +cost3;
                dp[i][j] = Math.min(dp[i][j],finalCost);
            }
        }
    }
    print(dp);
    return dp[1][n-1];
    }
    public static void print(int dp[][]){
        for( int i=0;i<dp.length;i++){
            for( int j= 0 ; j<dp[0].length;j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String arg[]){
        int arr[] = { 1,2,3,4,3};
        int n = arr.length;
        System.out.println(mcm(arr,1,n-1));

        int dp[][] = new int[n][n];
        for( int i =0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(memmcm(arr,1,n-1,dp));

        
        System.out.println(tabmcm(arr));



    }
}

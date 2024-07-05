// catalan's number
import java.util.*;

public class dp9 {

    // recursion 
    public static int catalanRec(int n){
        if( n == 0 || n == 1 ){
            return 1;
        }
        int ans = 0 ; 
        for( int i = 0 ; i <= n-1 ; i++){
            ans += catalanRec(i) * catalanRec( n-i-1);
        }
        return ans;
    }

    // memorization
    public static int catalanMem(int n,  int dp[]){
        if( n ==0 || n ==1 ){
            return 1;
        }
        if( dp[n] != -1){
            return dp[n];
        }
        int ans = 0 ; 
        for( int i = 0 ; i < n ; i++){
            ans += catalanMem(i,dp) * catalanMem( n-i-1,dp);
        }
        return dp[n] = ans;
    }

    // tabulation -O(n^2)
    public static int catalanTab( int n){
        int dp[] = new int [n+1];
        dp[0] =1; 
        dp[1] =1;
    
        for( int i = 2 ; i<= n ; i++){
            for( int j = 0 ; j < i;j++){
                dp[i] += dp[j] * dp[i-j-1];
            } 
        }
        return dp[n];
    }


    // Counting BST  -O(n^2)
    public static int countBST( int n){
        int dp[] = new int [n+1];
        dp[0] =1; 
        dp[1] =1;
    
        for( int i = 2 ; i< n+1 ; i++){
            // c1 -> BST(1node_> dp[i])
            for( int j = 0 ; j < i;j++){
                // ci = cj * ci-j-1
                dp[i] += dp[j] * dp[i-j-1];
            } 
        }
        return dp[n];
    }

    // Mountain Ranges  -O(n^^2)
    public static int mountainRange( int n){
        int dp[] = new int [n+1];
        dp[0] =1; 
        dp[1] =1;
    
        for( int i = 2 ; i<n+1 ; i++){
            for( int j = 0 ; j < i;j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside  * outside;
            } 
        }
        return dp[n];
    }    
    public static void main(String agrs[]){
        // rec
        int n = 5;
        System.out.println(catalanRec(n));

        // mem
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalanMem(5,dp));

        // tab
        System.out.println(catalanTab(5));

        // countBST
        System.out.println(countBST(4));
        
        // mountainRange
        System.out.println(mountainRange( 5));

    }
    
}

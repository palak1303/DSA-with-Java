// longest substring
import java.util.*;

import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class dp6 {

// Longest Common  Subsequence
    public static int lcsub(String str1,String str2,int n, int m){
    // dp intialize
    int dp[][]  = new int[n+1][m+1];
    int ans = 0;
    for( int i = 0 ; i < n+1; i++){
        dp[i][0] = 0;
    }
    for( int j = 0 ; j < m+1; j++){
        dp[0][j] = 0;
    }

    for( int i=1; i< n+1; i++){
        for( int j= 1 ; j<  m+1;j++){
            if( str1.charAt(i-1) == str2.charAt(j-1)){
                dp[i][j] = dp[i-1][j-1] +1;
                ans = Math.max(ans, dp[i][j]);
            }else{
                dp[i][j] =0;
            }
        }
    }
    return ans;
}
// Longest Increasing substring O(n*m)
public static int lcs( int arr[],int arr2[]){
    int n = arr.length;
    int m = arr2.length;
    int dp[][] = new int [n+1][m+1];

    // initalize
    for( int i = 0 ; i < n+1; i++){
        dp[i][0] = 0;
    }
    for( int j = 0 ; j < m+1; j++){
        dp[0][j] = 0;
    }

    // bottom up
    for( int i=1; i< n+1; i++){
        for( int j= 1 ; j<  m+1;j++){
            if( arr[i-1] == arr2[j-1]){
                dp[i][j] = dp[i-1][j-1] +1;
            }else{
                int ans1 = dp[i-1][j];
                int ans2 = dp[i][j-1];
                dp[i][j] = Math.max(ans1,ans2);
            }
        }
    }
    return dp[n][m];

}

public static int lis(int arr[]){
    // dp intialize
    HashSet<Integer> set = new HashSet<>();
    for( int i = 0 ; i < arr.length;i++){
        set.add( arr[i]);
    }
    int arr2[] = new int[set.size()];
    int i=0;
    for( int num :set){
        arr2[i] = num;
        i++;
    }
    Arrays.sort(arr2);
    return lcs(arr,arr2);

}

public static void main(String arg[]){
    String str1 = "abcde";
    String str2 = "abec";
    int arr[] ={50,3,10,7,40,80};
    System.out.println(lcsub(str1,str2,str1.length(), str2.length()));
    System.out.println(lis(arr));
}
    
}

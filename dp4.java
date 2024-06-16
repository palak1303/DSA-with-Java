public class dp4 {
    // coin change 
    public static int coinChange(int coins[], int sum){
        int n= coins.length;
        int dp[][] = new int[n+1][sum+1];

       //intialize  sum is 0
        for( int i=0; i< n+1 ; i++){
            dp[i][0] = 1;        
        }
        for( int j=1;j<sum+1;j++){
            dp[0][j] = 0;
        }
        for( int i=1 ; i < n+1; i++){
            for( int j=1; j <sum+1; j++){
                if( coins[i-1] <= j){
                    dp[i][j] = dp[i][j-coins[i-1]] + dp[i-1][j];
                }
                else{
                    dp[i][j]  = dp[i-1][j];
                }
            }
        } 
        return dp[n][sum];
    }

    // rod cutting
    // weight = lenght ; val = price ;  w = totRod
    public static int rodCutting(int length[], int price[], int totRod){
        int n = price.length;
        int dp[][] = new int[n+1][totRod+1];

       //intialize  sum is 0
        for( int i=0; i< n+1 ; i++){
            dp[i][0] = 0;        
        }
        for( int j=1;j<totRod+1;j++){
            dp[0][j] = 0;
        }
        for( int i=1 ; i < n+1; i++){
            for( int j=1; j <totRod+1; j++){
                if( length[i-1] <= j){
                    dp[i][j] = Math.max(price[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
                }
                else{
                    dp[i][j]  = dp[i-1][j];
                }
            }
        } 
        return dp[n][totRod];
    } 

    

    public static void main(String agrs[]){
        int coins[] = { 1,2,3};
        int sum = 4;
        System.out.println(coinChange(coins,sum));

        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int totRod =8; 
        System.out.println(rodCutting(length, price, totRod));
     }
    
}

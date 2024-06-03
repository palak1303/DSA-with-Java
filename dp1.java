import java.util.*;
public class dp1 {
    // 1->fibonaaci
    public static int fib(int n){
        if( n == 1 || n ==0){
            return n;
        }
        return fib(n-1)  + fib( n-2);
    }
    // memorization
    public static int fib(int n, int f[]){
        if( n==0 || n==1){ 
            return  n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = fib(n-1,f) + fib(n-2,f);
        return f[n];
    }
    // tabulation
    public static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0]  = 0;
        dp[1]  = 1;
        for( int i= 2 ; i<= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    //2-> climbing 
    public static int ways(int N){
        if (N == 0){
            return 1;
        }
        if (N <0) {
            return 0;
        }
        return ways(N-1)  + ways(N-2) ;
        }
    // memorization
    public static int waymemo(int N , int c[]){
        if (N == 0){
            return 1;
        }
        if (N < 0) {
            return 0;
        }
        if( c[N] != -1 ){
            return c[N];
        }
        c[N] =waymemo(N-1 ,c) + waymemo(N-2,c) ;
        return c[N];
        }
    // tabulation
    public static int wayTabulation(int N){
        int c[] = new int[N+1];
        c[0]  = 1;
        c[1]  = 1;
        for( int i= 2 ; i<= N;i++){
            c[i] = c[i-1] + c[i-2];
        }
        return c[N];
    }
    // variation
    public static int wayTabulationVar(int N){
        int c[] = new int[N+1];
        c[0]  = 1;
        c[1]  = 1;
        c[2] = 2;
        for( int i= 3; i<= N;i++){
            c[i] = c[i-1] + c[i-2] + c[i-3];
        }
        return c[N];
    }
    // memorization
    public static int waymemoVar(int N ){
        int c[]=new int[N+1];
        Arrays.fill(c, -1);
        if (N == 0 || N ==1){
            return 1;
        }
        if (N < 0) {
            return 0;
        }
        if( c[N] != -1 ){
            return c[N];
        }
        c[N] =waymemoVar(N-1) + waymemoVar(N-2) + waymemoVar(N-3);
        return c[N];
        }


    public static void main(String args[]){
        // 1->fib
        int n= 5;
        int f[] = new int[n+1];
        System.out.println(fib(n,f));
        System.out.println(fibTabulation(n));
        // 2->climbing
        int N= 5;
        int c[] = new int[N+1];
        Arrays.fill(c,-1);
        System.out.println(ways(N));
        System.out.println(waymemo(N,c));
        System.out.println(waymemoVar(N));
        System.out.println(wayTabulation(N));
        System.out.println(wayTabulationVar(N));
    }
}

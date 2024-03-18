import java.util.*;
public class recursion{
    // public static void Decrease(int n ){     //deccreasing order
    //     if( n ==1 ){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print( n+ " ");
    //     Decrease(n-1);
    // } 

    // public static void increase(int n ){    //increasing order
    //     if( n == 1 ){
    //         System.out.println(n );
    //         return;
    //     }
    //     increase(n-1);
    //     System.out.println( n+ " ");
    // }

    // public static int fact(int n ){     //factorial
    //     if( n==0){
    //         return 1;   
    //     }
    //     // int fnm1 = fact(n-1);
    //     int fn = n* fact(n-1);
    //     return fn;
    // }

    // public static int Sum(int n ){     // sum of n
    //     if( n==0){
    //         return 0;   
    //     }
        // int fnm1 = fact(n-1);
    //     int fn = n + Sum(n-1);
    //     return fn;
    // }

    //  public static int fib(int n ){     // fibonacci   O(n^2)time, O(n)space
    //         if( n==0  || n==1){
    //             return n;   
    //         }
    //         int fn = fib(n-1)+ fib(n-2);
    //         return fn;
    //     }
    
    // public static boolean isSorted( int arr[], int i){        //is sorted or not
    //     if( i == arr.length - 1){
    //         return true;
    //     }
    //     if( arr[i] > arr[i+1]){
    //         return false;
    //     }
    //     return isSorted(arr, i+1);
    // }

// public static int firstOcc(int arr[], int key,int i){       //first occurence
//     if( i == arr.length){
//         return -1;
//     }
//     if( arr[i] == key){
//         return i;
//     }
//     return firstOcc( arr,key , i+1);
// }

// public static int lastOcc(int arr[], int key,int i){       //last occurence
//         if( i == 0){
//             return -1;
//         }
//         if( arr[i] == key){
//             return i;
//         }
//         return lastOcc( arr, key , i-1);
//     }

// public static int power(int x,int i){       // x^n
//             if( i == 0){
//                 return 1;
//             }
//             return ( x * power(x,i-1));
  
//         }

public static int optimizedpower(int a, int n){
    if( n==0){
        return 1;
    }
    int halfPwerSqr = optimizedpower(a,n/2)* optimizedpower(a, n/2);
    if( n%2 !=0){
        halfPwerSqr = a* halfPwerSqr;
    }
    return halfPwerSqr;
}
    public static void main(String args[]){    
        // int n = 5;
        // Decrease(n);
        // increase(n);
        // System.out.print("Enter no :");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.close();
        // System.out.println("factorial :"+fact(n));    //fact
        // System.out.println("sum :"+ Sum(n));          //sum
        // for( int i = 1; i  <= n ; i++){               //fib
        // System.out.println( fib(i));}
        // System.out.println(" fibonacci th no:"+fib(n));
        // int arr[] = {2,3,4,5,1};                       //sorted
        // System.out.println(isSorted(arr,0));
        // int arr[] = {2,3,4,5,3,4,57,4,8,1,57};                 //first occurance    
        // System.out.println(lastOcc(arr,57,0));
        // System.out.println(lastOcc(arr,57,arr.length -1));   //lasr occ
        //  System.out.println(power(2,10));   //lx^n
         System.out.println(optimizedpower(2,10));
    }
}
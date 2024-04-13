    // PATTERN PRINTING
// import java.util.*;

public class pattern {

       // HOLLOW RECTANGLE
    public static void hollow_rectangle(int row,int col){

    for(int i = 1; i<=row; i++){
        for(int j=1; j<=col; j++){
            if(i == 1 || i == row || j == 1 || j == col){
               System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
        System.out.println();
    } 
}  




//        INVERTED PYRAMIND
//  public static void inverted_pyd(int n){
//     for (int i=1; i<=n; i++){
//         for (int j=1 ; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         for(int j = 1; j<=i;j++){
//             System.out.print("*");
//                 }
//         System.out.println();
//             }
//         } 




//        INVERTED HALF PYD WITH NO
// public static void inverted_pyd_withno(int n){
//     for(int i = 1;i<=n; i++){
//         for(int j=1;j<=n-i+1;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println(" ");
//     }
// }

// FLOYD TRIANGLE
// public static void floyd_tri(int n){
//     int counter =1;
//     for( int  i = 1; i<=n ; i++){
//         for ( int j=1; j <= i; j++){
//             System.out.print(counter+ " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }




//    0-1 Triangle
// public static void zeroone_tri(int r,int c){
//     for( int  i = 1; i<=r ; i++){
//         for ( int j=1; j <= i; j++)
//             if((i+j)%2==0){
//             System.out.print(" 1");
//             }else{
//                 System.out.print("0");
//             }
        
//         System.out.println();
//     }
// }


 
// BUTTERFLY
// public static void butterfly(int n){
//     for( int  i = 1; i<=n ; i++){
//         for ( int j=1; j <= i; j++){
//             System.out.print("*" );}
//         for ( int j=1; j <= 2*(n-i); j++){
//             System.out.print(" " );}
//         for ( int j=1; j <= i; j++){
//             System.out.print("*" );}
//             System.out.println();
//         }
//         for( int  i = n; i>=1 ; i--){
//             for ( int j=1; j <= i; j++){
//                 System.out.print("*" );}
//             for ( int j=1; j <= 2*(n-i); j++){
//                 System.out.print(" " );}
//             for ( int j=1; j <= i; j++){
//                 System.out.print("*" );}
// //                 System.out.println();
// }
// }




// SOLID RHOMBUS
// public static void rhombus(int n){
//     for(int i = 1; i<= n ; i++){
//         for( int  j = 1; j<=(n-i); j++){ 
//             System.out.print(" " );
//         }
//         for ( int j=1; j <= n; j++){
//             System.out.print(" *" );
//         }
//         System.out.println();
//         }
//     }
// }




// HOLOW RHOMBUS
// public static void hollow_rhombus(int n){
//     for(int i = 1; i<= n ; i++){
//         for( int  j = 1; j<=(n-i); j++){ 
//             System.out.print(" " );
//          }
//         for(int j = 1; j<=n;j++){
//             if(i == 1 || i == n || j == 1 || j == n){
//                System.out.print("*");
//             } else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     } 
// }  




// DIAMOND
// public static void diamond(int n){
//     for( int  i = 1; i<=n ; i++){
//         for ( int j=1; j <=( n-i); j++){
//             System.out.print(" " );}
//         for ( int j=1; j <= (2*i)-1; j++){
//             System.out.print("*" );}
//             System.out.println();
//         }
//         for( int  i = n; i>=1 ; i--){
//             for ( int j=1; j <=(n- i); j++){
//                 System.out.print(" " );}
//             for ( int j=1; j <= (2*i)-1; j++){
//                 System.out.print("*" );}
//                 System.out.println();
// }
// }
public static void main(String args[]){
    hollow_rectangle(4,8);
    // inverted_pyd(4);
    // inverted_pyd_withno(7);
    // floyd_tri(5);
    // zeroone_tri(5,5);
    // butterfly(3);
    // hollow_rhombus(5);
//     diamond(7);
}
}

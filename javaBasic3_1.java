public class javaBasic3_1 {
    import java.util.*;

// prime  
// public static boolean isPrime(int n){
//     boolean isPrime = true;
//     for(i=1;i<=n-1;i++){
//         if(n%i==0){
//         isPrime = false;
//         break;
//     }
// }
// return isPrime;
// }
// optimize prime
// public static boolean isprime( int n){
//     if(n==2){
//         return true;
//     }
//     for ( i = 1; i<=Math.sqrt(n);i++ ){
//         if(n%i == 0){
//             return false;
//         }
//     }
//     return true;
// }
// public  static void main(String args[]){
//     System.out.println(isPrime(5));
//     isPrime(5);
// }

// public static void Primeinrange(int n){
//     for(int i = 1;i<n;i++){

//         if(isprime(i)){
//             System.out.print(i+"");
//         }
//     }
//     System.out.println();
// }
// public  static void main(String args[]){
//     Primeinrange(20);
// }




// BINARY TO DECIMAL
// public static void binToDec(int binNum){
//     int myNum = binNum;
//     int pow = 0;
//     int docnum = 0;
//     while(binNum>0){
//         int lstdigit = binNum %10;
//         docNum = docNum + (lstdigit * (int)Math.pow(2,pow));
                 
//         pow++;
//         binNum  = binNum/10;

//     }
//     System.out.println("decimalof"+ myNum +"="+ decNum);
// }
// public static void main(String args[]){
// binToDec(101);
// }

// // DECIMAL TO BINARY
// public static int  DecToBin(int n){
//     int myNum = binnum;
//     int pow = 0;
//     int binnum = 0;
//     while(n>0){
//         int rem = n%2;
//         binnum = binnum + (rem * (int) Math.pow(10,pow));       
//         pow++;
//         n = n/2;

//     }
//     System.out.println("binary of"+ myNum +"="+ binnum);
// }
// public static void main(String args[]){
    // decTobin(7);
    // }


// public static void printS(){
//     // int s = 45;METHOD SCOPE{
//         // int p = 23;BLOCK SCOPE
//     }
// }    
// public static void main(String[] args){
//     System.out.println(S);
// }





}

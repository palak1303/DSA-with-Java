    import java.util.*;
public abstract class javaBasic3{
// func define HELLO
    // public static void printhello(){
    //     System.out.print("hello world");
    //     System.out.print("hello world");
    //     System.out.print("hello world");
    //     return;
    // }
// func define SUM
    public static int calSum(int a, int b)  {        
        int sum = a + b;
        return sum;
    // } 

// FUNCTION DEFINE MULTIPLY
    // public static int multiply(int a,int b){
    //     int product = a*b;
    //     return product;
    // }
// FUNCTION DEFINE SWAP
    // public static void swap(int a,int b){
    //     int temp = a;
    //     a    = b ;
    //     b = temp;
// FUNCTION FACTORIAL
// public static int factorial(int n ){
//     int f = 1;
//      for(int i = 1; i<=n;i++){
//         f = f * i;
//     }
//     return f;
// }
// // BINAOMIAL COEFFICIENT
// public static int binomial(int n,int r){
//  int fact_n = factorial(n);
//  int fact_r = factorial(r);
//  int fact_nmr = factorial(n-r);
//  int binomial = fact_n/(fact_r*fact_nmr);
//  return binomial;
// }
// SUM OF 2 NO    //
public static int sum(int a,int b){
    return a+b;
//  }

// SUM OF 3 NO    //
// public static int sum(int a,int b,int c){
//     return a+b+c;
//  }

// FUNC TO CAL INT SUM
// public static int Sum(int a,int b , int c){
   
// }


}
              // function call
    public static void main(String args[]) {
//SUM 
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b =sc.nextInt();
        // int sum = calSum(a,b);   
        // System.out.println("sum is "+ sum);
//HELLO 
        // printhello();  
//CALL BY REFERENCE
        // int a  = 5;
        // int b = 10; 
        // swap (a,b);
        // System.out.println("a = "+ a);
        // System.out.println("b=  "+ b);
//MULTIPLY
        //  Scanner sc = new Scanner(System.in);
        //  int a = sc.nextInt();
        // int b = sc.nextInt();
        // int product = multiply(a,b);
        // System.out.println("a*b="+product);
//FACTORIAL
        // System.out.println(factorial(4));;
// BINOMIAL 
    //     System.out.println(binomial(5,2));
    //
//SUM OF 2 NO 
    System.out.println(sum(3,5));
    // System.out.println(sum(3,5,6));

}
}

}

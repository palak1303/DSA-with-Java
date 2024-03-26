import java.util.*;
public class stringpractice {

    // public static void printletter( String str){
    //     for ( int i = 0; i <str.length(); i++ ){
    //         System.out.print(str.charAt(i)+ " ");
    //     }
    //     System.out.println();
    // }
    
    // public static void main(String args[]){
    // char arr[] = { 'a', 'b','c','d'};
    // String str1 = " abcd";
    // String str2 = new String ("xyz");

    // strings are IMMUTABLE.(not change)---------------
    
    // Scanner sc = new Scanner(System.in);
    // String name;
    // // name = sc.next();        ---only 1st name
    // name = sc.nextLine();       
    // System.out.println(name);
     
    // String fullname = "tony  stark";
    // System.out.println(fullname.length());


    // CONCATENTATION
    // String firstname = "palak";
    // String lastname = " rehan";
    // String fullname = firstname + " "+ lastname;
    // System.out.println(fullname+ " is this");
    // System.out.println(fullname.charAt(0));
    
    // printletter(fullname);



    //    ****************PALINDROME **********************
        //   EXAMPLE - RACECAR
        // public static boolean isPalindrome( String str){ 
        //      for( int i = 0; i < str.length()/2; i++){
        //         int n = str.length ();
        //         if( str.charAt(i) != str.charAt(n-1-i)){
        //             return false;
        //         }
        //      }
        //      return  true;
        // }
        // public static void main( String args[]){
        //     String str = " madam";
        //     System.out.println( isPalindrome(str));
        // } 


    //  direction question  WNEENESENNN----O(n)
    // public static float shortest ( String path){
    //     int x = 0, y = 0;

    //     for ( int i = 0 ; i < path.length(); i++){
    //         char dir  = path.charAt( i);
    //         if( dir == 'S'){
    //             y--;
    //         } 
    //         else if( dir == 'N'){
    //             y++;
    //         }
    //         else if( dir == 'W'){
    //             x--;
    //         }
    //         else{
    //             x++;
    //         }
    //     }
    //     int X2 = x*x;
    //     int Y2 = y*y; 
    //     return (float)Math.sqrt(X2 + Y2);

    // }
    // public static void main( String args[]){
    //     String path = "WNEENESENN " ;
    //     System.out.print(shortest(path));
    // }


    // compare
//    public static void main( String agrs[]){
//       String s1 = " tony";
//       String s2 = " tony";
//       String s3 = new String (" tony");

//       if ( s1==s2){
//          System.out.print( " strings are  equal");
//       }
//       else{
//             System.out.print( " string are not equal");      }

//      if ( s1==s3){
//      System.out.print( " strings are  equal");
//     }
//     else{
//        System.out.print( " string are not equal");      }
  
//     if ( s1.equals(s3)){
//         System.out.print( " strings are  equal");
//     }
//     else{
//        System.out.print( " string are not equal");      }
// } 
    

// substring 
// public static String Substring ( String str , int si , int ei){
//     String substr = "";
//     for( int i = si ; i < ei ; i++){
//         substr += str.charAt(i);
//         }
//         return substr;
// }
// public static void main(String args[]){
//     String str = " helloworld";
//     System.out.print( str.substring(0,5));
    // System.out.println( Substring ( str,0,5));
// }

// public static void main( String args[]){
//     String fruits[] = { " apple" , " banana", " mango"};
    
//     String Largest = fruits[0];
//     for( int i  = 1; i < fruits.length; i++){
//         if( Largest.compareTo(fruits[i])< 0){
//                 Largest = fruits[i];

//         } 
//     }
//     System.out.println(Largest);

// }
//  public static void main(String args[]){
//     StringBuilder sb = new StringBuilder("");
//     for(char ch = 'a'; ch <= 'z'; ch++){
//         sb.append(ch);
//         // O(26) complexity 
//     }
//     System.out.println(sb);
//  }
 
public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for (int i= 1;i<str.length();i++){
         if( str.charAt(i) ==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
         }else{
            sb.append(str.charAt(i));
         }
    }
    return sb.toString();
}

public static void main(String args[]){
    String str = " hi, i am palak";
    System.out.println(toUpperCase(str));
    System.out.print(str);
}


// ------------PRACTICE-----------------


// public static void main(String args[]){
// String str = new Scanner (System.in).next();
//     int count = 0;
//     for( int i = 0 ; i < str.length() ; i++){
//         char ch = str.charAt(i);
//         if(  ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
//         count ++;
//     }
// }
// System.out.print("count of vowels is "+ count);
// }
}

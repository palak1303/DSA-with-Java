import java.util.Scanner;

public class ifElse2 {
    public static void main( String args[]){
         // PRACTICE SET 4

// QUES1 ----> NEAGTIVE OR POSTIVE 
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// if( n>0){
// System.out.println("positive");
// }
// else{
//     System.out.println("negative");
// }
  
// QUES2 ----->FEVER
// double temp = 103.5;
// if( temp>100){
// System.out.println("You Have Fever");
// }
// else{
//     System.out.println("YOu Don't Have Fever");
// }


// QUES3 ---->DAY PRINTING
// Scanner sc = new Scanner( System.in);
// int n = sc.nextInt();
// switch(n){
//     case 1 :System.out.println("Monday");
//          break;
//     case 2 :System.out.println("Tuesday");
//         break;
//     case 3 :System.out.println("Wedesday");
//         break;
//     case 4 :System.out.println("Thursday");
//         break;
//     case 5 :System.out.println("Friday");
//        break;
//     case 6 :System.out.println("satday");
//         break;
//     case 7 :System.out.println("sunday");
//          break;
//     default:System.out.println("invalid");
//         break;
// }

// QUES ---->LEAP
// Scanner sc = new Scanner( System.in);
// System.out.println("input year");
// int year = sc.nextInt();

// boolean x = (year %4) == 0;
// boolean y = (year %100) != 0;
// boolean z = (year % 100 ==0)&& (year % 4==0);

// if ( x && ( y || z)){
//     System.out.println(year + "leap");
// }
// else{
//      System.out.println(year + "not leap");
// }


Scanner sc = new Scanner( System.in);
System.out.println("input year");
int year = sc.nextInt();
if( year % 4 == 0){
     if ( year % 100 == 0){
           if(year %400 ==0){
                 System.out.println(year + "leap");
                }
            else{
                 System.out.println(year + " not leap");
                }  } 
    else{
            System.out.println(year + " leap");
        }
    }
else{
     System.out.println(year + "not leap");
}




}
}

    import java.util.*;
public abstract class javaBAsic3_2 {
    

//     PRACTICE

// QUES---> COMPUTE AVG OF 3
// public static void main(String agrs[]){
//     Scanner sc = new Scanner (System.in);
//     System.out.print("input 1nu");
//     int x = sc.nextInt();
    
//     System.out.print("input 2nu");
//     int y = sc.nextInt();
    
//     System.out.print("input 3nu");
//     int z = sc.nextInt();
//     System.out.println("avg is "+avg(x,y,z));
// }
// public  static int avg(int x,int y,int z) {
//     return avg = (x+y+z)/3;
// }




// QUES--->EVEN OR ODD?
 public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int num;

    System.out.println("enter a number");
    num = sc.nextInt();
     
    if(IsEven(num)){
        System.out.println("number is even");

    }
    else{
        System.out.println("number is odd");
    }
    }

    public static boolean IsEven( int num){
        if(num %2 ==0){
            return true;
        }
        else{
            return false;
        }
    }

}    


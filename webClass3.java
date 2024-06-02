import java.util.*;
    
// multiple inhertance
    // interface palak{
    //   public int add(int a, int b);
    // }

    // interface rehan{
    //   public int max( int a , int b);
    // }

    // class palakRehan implements palak, rehan{
    //   public int add(int a, int b){
    //     return a+b;
    //   }
    //   public int max(int a, int b){
    //     return a> b? a:b;
    //   }
    // }


    // Abstract class
      abstract class Palak {
          abstract int max(int a, int b, int c);
          public int max( int a, int b){
            return a> b ? a:b;
          }
        }
     public class webClass3{
      public static void main(String args[]){
        // palakRehan p1 = new palakRehan();
        // System.out.println(p1.add(1,2));
        // System.out.println(p1.max(8,2));

        Palak p1 = new Palak(){
          public int max( int a, int b,int c){
            return max(a,b)>c? max(a,b):c;
          }
        }; 
        System.out.println(p1.max(1,2,3));
        }
    }

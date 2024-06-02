import java.util.*;
public class webclass {
    // interface
    // to multiple multiple inheritance(multiplr a , b -> c)
    // total abstraction
    //  all methods are public , static ,and without imlplementation, 
    //variable are final, staic and public
    public static void main(String args[]){
        // Queen q = new Queen(); 
        // q.moves();
        // palak p1 = new palak();
       
        // System.out.println( p1.checkPalidrome(1234321));

    }

}
    // Abstraction
// abstract class palakWork{
//     abstract boolean checkPalidrome(int n);

//         public int reverse(int n)
//         {
//             int rev=0, rem;
//             while(n>0)
//             {
//                 rem=n%10;
//                 rev = rev*10 +rem;
//                 n=n/10;
//             }
//             return rev;
//         }   
// }

// class palak extends palakWork
// {
//     public boolean checkPalidrome(int n)
//     {
//         if(n == reverse(n)){
//             return true;
//         }
//         else{ 
//             return false;
//         }
//     }
//   }

// interface ChessPlayer{
//     void moves();

// }
// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println(" up,down,left,right,diagonal(in all direcdtions)");
//     }
// }
// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println(" up,down,left,right");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println(" up,down,left,right,diagonal(by 1 step)");
//     }
// }



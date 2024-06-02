import java.util.*;

public class webClass2 {

    public static void main(String[] args) {

        //  TRY and CATCH 
        for( int i = 1; i <= 3; i++){
            try{
                switch(i){
                    case 1:
                    int arr[] = new int[10];
                    System.out.println(arr[10]);
                    break;

                    case 2:
                    String s = "PALAK";
                    System.out.println(s.charAt(12));
                    break;

                    case 3:
                    int a = 10, b = 0;
                    System.out.println(a/b);
                    break;
                }
            }
            catch(ArrayIndexOutOfBoundsException e ){
                System.out.println("array related problem");
            }
            catch(StringIndexOutOfBoundsException se ){
                System.out.println("String related problem");
            }
            catch(ArithmeticException ae ){
                System.out.println("No is divided by zero");
            }
        }
    }
}


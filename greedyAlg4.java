import java .util.*;

// Indian coins
public class greedyAlg4 {
    public static void main(String[] args) {
        
        
    int currency[] = { 1,2,5,10,20,50,100,500,2000};
    int val = 590 ;
    // int ans [] = new int[10];
    ArrayList<Integer> ans = new ArrayList<>();
    int count = 0;

    while(val!=0){
    for( int i =currency.length-1; i>=0;i--){
        if( val >= currency[i]){
            // ans[count] =  currency[i];
            ans.add(currency[i]);
            count ++;
            val = val - currency[i]; 
            break;
        }

     }
    }
    System.out.println(count);
    // for (int i = 0; i < ans.length; i++) {
    //     System.out.print(ans[i]+ "+");
    // }
    System.out.println(ans);



}
}
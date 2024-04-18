import java.util.*;
public class stackTrapping WaterWater {
   public static void maxWater(){
    int MaxWater = 0;
    int nml = new int [arr.lenght];

    Stack<Integer> s = new Stack<>();
    for( int i = arr.length-1;i>=0;i--){
        while(!s.isEmpty()&&arr[s.peek()] >= arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            //-1
            nml[i] = arr.length;

        }else{
            //top
            nml[i] = s.peek();
        }
        s.push(i);
    }



   } 
   public static void main(String[] args) {
    int arr[] = { 7,0,4,2,5,0,6,4,0,6};
    maxWater(arr);
    }
   
}

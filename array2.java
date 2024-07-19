import java.util.*;

public class array2 {
    public static int trappedRainwater(int ht[]){
        //  cal left max boundary
        int leftMax[] = new int [ht.length];
        leftMax[0] = ht[0];
        for( int i = 1 ; i<ht.length;i++){
            leftMax[i] = Math.max(ht[i], leftMax[i-1]);
        }
        // cal right max boundary
        int rightMax[] = new int [ht.length];
        rightMax[ht.length-1] = ht[ht.length-1];
        for( int i = ht.length-2 ; i>=0;i--){
            rightMax[i] = Math.max(ht[i], rightMax[i+1]);
        }
        
        int trappedwater = 0;
        // loop
        for( int i =0;i<ht.length;i++){
            // water level min(left,right) 
            int waterlvl = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height
            trappedwater += waterlvl -ht[i];
        }
        return trappedwater;
    }

    public static boolean array(int num[]){
        for( int i = 0;i<num.length;i++){
            for (int j = i+1; j <num.length;j++){
                if( num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main( String args[]){
        int ht[] = { 0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedRainwater(ht));

        int num[] = { 1,2,3,1,4};
        System.out.println(array(num));
    }

}
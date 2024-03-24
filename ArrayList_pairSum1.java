import java.util.*;
public class ArrayList_pairSum1 {
    //
    // public static boolean pairsum1(ArrayList<Integer> list,int target){
//brute appraoch
    //     for(int i = 0; i<list.size();i++){
    //         for(int j = i+1; j<list.size();j++){
    //             if(list.get(i)+ list.get(j) == target){
    //                 return true;
    //             }      
    //         }
    //     }
    //     return false;
    // }

    //2pointer Approach     --linear(O(n))
    // public static void pairsum2(ArrayList<Integer>list,int target){
    //     int lp = 0;
    //     int rp = list.size() -1;
    
    //     while(lp < rp ){
    //         //update
    //         if (list.get(lp)+ list.get(rp) == target) {
    //             System.out.println(list.get(lp) + ","+ list.get(rp));
    //         }
    //         if(list.get(lp)+ list.get(rp) > target){
    //             rp--;
    //         }
    //         else{
    //             lp++;
    //         }
    //     }
    //     return;
    // }          

    
//2pointer appraoch for rotated and sorted arrray    --linear(O(n)
public static boolean pairSum2(ArrayList<Integer>list,int target){
    int bp = -1;
    for(int i = 0;i<list.size();i++){
        if(list.get(i) > list.get(i+1)){
            bp = i;
            break;
        }

    }
    int lp = bp+1; //smallest
    int rp = bp;
    int n = list.size();

    while(lp != rp){
        //case1
        if(list.get(lp) + list.get(rp) == target ){
            return true;
        }
        //case2
        if(list.get(lp) + list.get(rp)< target){
            lp = (lp+1) % n;
        }
        else{
            //case3
            rp = (n+ rp -1)%n;

        }
    }
 return false;
    
}
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1,2,3,4,5,6
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        // System.out.println(pairsum1(list,target));
        // pairsum2(list,target);
        System.out.println(pairSum2(list,target));
    }

}

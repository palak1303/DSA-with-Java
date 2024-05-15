import java.util.*;

public class hashMap3 {

    public static boolean isAnangram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character , Integer> map = new HashMap<>();

        for( int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i) ;
            map.put(ch, map.getOrDefault(ch,0)+1);   
        }
        
        for( int i = 0 ; i< t.length(); i++){
            char ch = t.charAt(i);
            if( map.get(ch) != null){
                if( map.get(ch) ==1){
                map.remove(ch);
            }else{
                map.put(ch, map.get(ch)-1);
            }
        }else{
            return false;
        }
    }
    return map.isEmpty();

    }
    public static void main(String args[]){
        int arr[] = { 1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for( int i = 0 ; i < arr.length ; i++){
            // if( map.containsKey(arr[i])){
            //     map.put(arr[i], map.get(arr[i])+1);
            // }else{
            //     map.put(arr[i], 1);
            // }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        //  Set<Integer> keyset = map.Set();
        for( Integer key : map.keySet()){
            if( map.get(key)> arr.length/3){
                System.out.println(key);
            }
        }

        //anangram O(n) 
        String s = "race";
        String t = "care";

        System.out.println(isAnangram(s,t));
 
    }
}

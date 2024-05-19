import java.util.*;

public class hashMap2 {
    public static void main(String args[]){

        // linkedList (doubly)   O(1)   -->in which it insert
        LinkedHashMap<String ,  Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("US",50);


        // tree hashmap(R) O(logn)     --> aplhabetical order
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("US",50);

        // hashMAp ( )      O(1,n)   -->random
       HashMap<String, Integer> hm = new HashMap<>();
       hm.put("India",100);
       hm.put("China",150);
       hm.put("US",50);

        System.out.println(lhm);
        System.out.println(hm);
        System.out.println(tm);
        

    }
    
}

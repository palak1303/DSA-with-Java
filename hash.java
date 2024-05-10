import java.util.*;

public class hash {
    public static void main(String args[]){
        //create
        HashMap<String,Integer> hm = new HashMap<>();
        //insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        System.out.println(hm);

        //get-o(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indoesia"));

        //containKey -o(1)

        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indoesia"));

        //remove
        // System.out.println(hm.remove("Indoesia"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //claer
        // hm.clear();
        // System.out.println(hm.isEmpty());

        // Iterate
        //entry set()
        Set<String > keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("keys="+ k +",value=" + hm.get(k) );
        }
    }
}

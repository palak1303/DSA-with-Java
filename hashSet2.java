import java.util.*;
public class hashSet2 {
    public static void main(String[] args) {
        
        // random order
        // HashSet<String> cities = new HashSet<>();
        // cities("Delhi");
        // cities("noida");
        // cities("Jammu");
        // cities("Bengaluru");

        // same order as insert 
        LinkedHashSet <String> lset =new LinkedHashSet<>();
        lset.add("noida"); 
        lset.add("deoria");
        lset.add("jammu");
        lset.add("delhi");
        System.out.println(lset);

        lset.remove("delhi");
        System.out.println(lset);

        // ascending order
        TreeSet <String> ls =new TreeSet<>();
        ls.add("noida"); 
        ls.add("deoria");
        ls.add("jammu");
        ls.add("delhi");
        System.out.println(ls);
        
    }
}
import java.util.LinkedList;   //JCF optimized

import org.w3c.dom.Node;

public class linked_list3 {



    public static void main(String[] args) {
        //create  - object int , boolean,float ---> integre , float ,charcater
        LinkedList<Integer> l1 = new LinkedList<>();
        //add
        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(0);
        System.out.println(l1);
        //remove
        l1.removeFirst();
        l1.removeFirst();
        System.out.println(l1);

        }
}

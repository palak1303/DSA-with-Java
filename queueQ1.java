import java.util.*;
public class queueQ1 {
    //microsoft -O(1)
    // public class Node {
    //         static int data;
    //         Node next;
            
    //         Node ( int data){
    //             this.data = data;
    //             this.next = null;
    //         }
    //     }    
    //     static class Queue{
    //     static Node head = null;
    //     static Node tail = null;

    //         public boolean isEmpty(){
    //             return head == null && tail == null;
    //         }

    //         //add
    //         public void add(int data){
    //             Node newNode=  new Node(data);
    //             if( head == null){
    //                 head = tail = newNode;
    //                 return;
    //             }
    //             tail.next = newNode;
    //             tail = newNode;
    //         }
            
    //         //remove
    //         public int remove(){
    //             if (isEmpty()) {
    //                 System.out.println("empty queue");
    //                 return -1;
    //             }
    //            int front = head.data;
    //            //singlr elememnt
    //            if( tail == head){
    //                 tail = head = null;
    //            }
    //            else{
    //             head = head.next;
    //            }
    //            return front;
    //         }
    //         //peek
    //         public int peek(){
    //             if (isEmpty()) {
    //                 System.out.println("empty queue");
    //                 return -1;
    //             }
    //             return head.data;
    //         }
    
    //     }
        public static void main(String[] args) {
            // Queue q= new Queue();
            pQueue<Integer> q = new LinkedList<>();   //arrayDeque( queue is a interfenec j bs that why onj ni banate)
            q.add(1);
            q.add(2);
            q.add(3);
            // System.out.println(q.remove());
            // q.add(4);
            // System.out.println(q.remove());
            // q.add(5);
            while(!q.isEmpty ()){
                System.out.println(q.peek());
                q.remove();
            }
           
        }
    
}

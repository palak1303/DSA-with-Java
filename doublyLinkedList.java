public class doublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node( int data){
             this.data= data; 
             this.next = null;
             this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

//add at first
    public void addFirst( int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
        head = tail = newNode;
        return;
        }

    newNode.next = head;
    head.prev = newNode;
    head = newNode;
        }

//add at last        
    public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
            head = tail = newNode;
            return;
            }
    
    newNode.prev = tail;
    tail.next = newNode;
    tail= newNode;
            }
        
 //print
    public void print(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }



//remove
public void removeFirst(){
    int val ;
    if(head == null){
        return;
        }
    else if(size ==1){
        val = head.data;
        head = tail = null;
    
    }
        val = head.data;
        head= head.next;
        head.prev = null;
        size--;
        System.out.println("remove data is:"+ val);
}
//remove at last
public void removeLast(){
    int val ;
    if(head == null){
        return;
        }
    else if(size ==1){
        val = head.data;
        head = tail = null;
    
    }
        val = tail.data;
        tail= tail.prev;
        tail.next = null;
        size--;
        System.out.println("remove data is:"+ val);
}

// Reverse
public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr!= null){
        next = curr.next;
        curr.next = prev;
        curr.prev = next;
        prev = curr;
        curr = next;
    }
    head = prev;
}

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
        dll.removeLast();
        dll.print();
        dll.reverse();
        dll.print();
    }
}

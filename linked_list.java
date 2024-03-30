public class linked_list {
     
    
   public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
   } 
public static Node head;
public static Node tail;
public static int size;

// // method - add first
public void addFirst(int data){
    //step 1 = create new node
    Node newNode = new Node(data);
    size++;

    if(head == null){
        head = tail = newNode;
        return;
    }
    //step 2= newnode next = head
    newNode.next = head; //link

    //ste3 = heafd = newNode
      head = newNode;

}
// method - add Last 
public void addLast(int data){
    //step 1 = create new node
    Node newNode = new Node(data);
    size++;

    if(head == null){
        head = tail = newNode;
        return;
    }
    //step 2= newnode next = head
    tail.next = newNode; //link

    //ste3 = heafd = newNode
      tail = newNode;

}

//add in the middle
public void addMid(int idx,int data){
    if(idx == 0){
        addFirst(data);
        return;
    }
    size++;
    //ste1 
    Node newNode = new Node(data);
    //step 2 = find idx
    Node temp = head;
    int i = 0;
    while(i< idx-1){
        temp = temp.next;
        i++;
    }
    //step 3 = link &insert
    newNode.next = temp.next;
    temp.next = newNode;

}


public void print(){
    if(head == null){
        System.out.println(" LL is empty");
    }  
Node temp = head;
while(temp != null){
    System.out.print(temp.data + " -> ");
    temp = temp.next;
}
System.out.println("null");
}
// method - remove First 
public void removeFirst(){
    int val ;
    if(size ==0){
        return;
    }else if(size ==1){
        val = head.data;
        head = tail = null;
    }
    //step1 
    val = head.data;
    head = head.next ; //link
    size--;
    System.out.println("remove data is "+val);

}
// method - remove Last 
public void removeLast(){
    int val ;
    if(size ==0){
        return;
    }else if(size ==1){
        val = tail.data;
        head = tail = null;
    }
    Node temp = head ;
    int idx =0;
    while(idx <size-2){           //for(ini i= 0 ; i<size-2;i++)
        temp = temp.next;
        idx++;
    }
    val = tail.data;      //tail = temp.next
    temp.next = null;
    tail = temp;
    size--;
    System.out.println("remove data is "+val);

}
//search (iterative)
public int iterSearch(int key){
    
    Node temp = head;
    for(int i = 0; i<= size-1 ; i++){     //cond = temp!= null
        if( temp.data == key ){
            return i;
        }
        temp = temp.next;
    }
    return -1;
}

//recursive search
public int helper(Node head,int key){
     //base
     if( head ==null ){
         return -1;
     }
     if( head.data == key){
        return 0;
     }
     int idx = helper(head.next,key);
        if( idx == -1){
            return -1;
        }
        return idx+1;
    }
public int recuSearch(int key){
    return helper(head,key);
}

//reverse   -o(n)
public void reverse(){
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr!= null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
}

//find and remove nth node from end
public void DeletNthFormEnd(int n){
    //cal size
    int sz = 0 ;
    Node temp = head;
    while( temp!= null){
        temp = temp.next;
        sz++;
    }
    if( n == sz){
        head = head.next;
        return;
    }
     //sz-n
     int i = 1;
     int iToFind = sz - n;
     Node prev = head;
     while(i< iToFind){
        prev = prev.next;
        i++;
     }
     prev.next = prev.next.next;
     return;


}
   public static void main(String[] args) {
    linked_list l1 = new linked_list();
    // l1.head = new Node(1);        //default for 1
    // l1.head.next  = new Node(2);
    l1.print();  
    l1.addFirst(2);
    l1.print();                //addFirst
    l1.addFirst(1); 
    l1.print();  
    l1.addLast(3);    
    l1.print();                //addLast
    l1.addLast(4);
    l1.print(); 
    l1.addMid(2,9);     //addmid
    l1.print();
    // l1.removeFirst();         //removefirts
    // l1.print();
    // l1.removeLast();           //removeLast
    // l1.print();
    // System.out.println(l1.iterSearch(5));        //iterserach
    // System.out.println(l1.recuSearch(2));        //recuserach
    //  System.out.println("size is "+ l1.size);         //size
    // l1.reverse();
    // l1.print();
    l1.DeletNthFormEnd(4);
    l1.print();
   }

}

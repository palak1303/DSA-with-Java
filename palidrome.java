public class palidrome{
public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addfirst(int data){    //o(1)
         // step 1 create a new node
         Node newnode=new Node(data);
         size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
       
        // new node next => head
        newnode.next=head;
        // head=>newnode
        head=newnode;
    }
//palidrome
//step1  - find mid
public Node findMid(Node head){
    Node slow = head;
    Node fast = head;
    while( fast!= null&&  fast.next!= null){
        slow = slow.next;  //+1
        fast  = fast.next.next; //+2
    }
    return  slow;   //slow is my middle
}
public boolean checkPalidrome(){
    if(head== null || head.next == null){
        return true;
    }
    //step1
    Node midNode = findMid(head);
    //step 2 - 2nd half reverse

    Node prev = null;
    Node curr = midNode;
    Node next;

    while(curr!= null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev; //right half head
    Node left = head;

//step 3 - chec if 1st half = 2nd half
while(right != null){
    if( left.data != right.data){
        return false;
    }
    left = left.next;
    right = right.next;
}
return true;
}

public void printlinklist(){
    if (head==null) {
        System.out.println("ll is empty");
    }
    Node temp =head;
    while (temp!=null) {
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("null");
}

    public static void main(String[] args) {
        palidrome l1 = new palidrome();
        l1.addfirst(1);
        l1.addfirst(2);
        l1.addfirst(3);
        l1.addfirst(4);
        l1.addfirst(4);
        l1.addfirst(3);
        l1.addfirst(2);
        l1.addfirst(1);
        l1.printlinklist();
        System.out.println(l1.checkPalidrome());
    }
}
public class linkedList4 {
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

    public void addfirst(int data){     
        Node newnode=new Node(data);
        size++;
       if(head==null){
           head=tail=newnode;
           return;
       }
       newnode.next=head;
       // head=>newnode
       head=newnode;
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

    // ques1 --> find intersection point
    // public Node getIntersectionNode(Node head1,Node head2){
    //     while( head2!= null){
    //         Node temp = head1;
    //         while( temp!= null){
    //             if( temp == head2){
    //             return head2;
    //         }
    //         temp = temp.next;
    //     }
    //     head2 = head2.next;
    //     }
    //    return null;
    // }

    // ques 2 ---> delete n node after m node
        public void delNafterM(Node head,int n, int m){
        Node temp = head,t;
        while( temp != null){
              for( int  i = 1 ; i< n && temp  != null; i++){
                temp = temp.next;
              }
              if( temp == null){
                 return;
              }
              t = temp.next;
              for(int i = 1; i<= n && t != null; i++ ){
              Node curr= t;
             t= t.next; 
              }
              temp.next = t;
              temp= t;
        }


        }









    public static void main(String[] args){

        // ques1
        // linkedList4 list = new linkedList4();
        // Node head1, head2;
        // head1 = new Node(10);
        // head2 = new Node(3);
        // Node newNode = new Node(6);
        // head2.next = newNode;
        // newNode = new Node(9);
        // head2.next.next = newNode;
        // newNode = new Node(15);
        // head1.next = newNode;
        // head2.next.next.next = newNode;
        // newNode = new Node(30);
        // head1.next.next = newNode;
        // head1.next.next.next = null;
        // Node intersectionPoint= list.getIntersectionNode(head1, head2);
        // if (intersectionPoint == null) {
        //     System.out.print(" No Intersection Point \n");
        //  }else {
        //     System.out.print("Intersection Point: "+ intersectionPoint.data);
        // }


        //ques2
        linkedList4 l1 = new linkedList4();
        l1.addfirst(1);
        l1.addfirst(2);
        l1.addfirst(3);
        l1.addfirst(4);
        l1.addfirst(5);
        l1.addfirst(6);
        l1.addfirst(7);
        l1.addfirst(8);
        
     }
 }

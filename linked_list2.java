public class linked_list2 {
    public static class node {
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    
    public void addfirst(int data){     
         // step 1 create a new node
         node newnode=new node(data);
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
    public void printlinklist(){
        if (head==null) {
            System.out.println("ll is empty");
        }
        node temp =head;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

//detect a loop in a ll    --- floyd's  FCA
    // public static boolean isCycle(){
    //      node slow = head;
    //      node fast = head;
    //      while(fast != null && fast.next!= null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if( slow == fast ){
    //             return true;      //cycle exist
    //         }
    //      }
    //      return false;   //cycle doesn't exist
    // }


//remove a cycle in loop
//     public static void removeCycle(){
//     //detect cycle
//         node slow = head;
//             node fast = head;
//         boolean cycle = false;
//         while( fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if( fast == slow){
//                 cycle = true;
//                 break;
//             }
//         }
//         if( cycle == false){
//             return;
//         }

//     //step 2 - finding meeting point
//     slow = head;
//     node prev = null;    //last node
//     while( slow != fast ){
//         prev = fast;
//         slow = slow.next;
//         fast = fast;
//     }

//     //step 3 - remove cycle
//     prev.next = null;

// }

// MERGE 
public node getMid(node head){
    node slow = head;
    node fast = head.next;
    while( fast!= null && fast.next !=null){
       slow = slow.next;
       fast = fast.next.next;
    }
    return slow;
}
private node merge(node head1, node head2){
    node mergell = new node(-1);
    node temp = mergell;

    while( head1 != null && head2 != null){
        if( head1.data <= head2.data ){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }else{
            temp.next = head2;
            head2 = head2.next;
            temp= temp.next;
        }
    }
    while( head1!= null){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }
    while( head2!= null){
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return  mergell.next;
}

public node mergeSort( node head){
    if( head == null || head.next == null){
        return head;
    }
    //find mid
    node mid = getMid(head);
    //left & right Ms
    node rightHead = mid.next;
    mid.next = null;
    node newLeft = mergeSort(head);
    node newRight = mergeSort(rightHead);
    //merge
    return merge(newLeft,newRight);
}


    public static void main(String[] args) {
        linked_list2 l1 = new linked_list2();
        l1.addfirst(1);
        l1.addfirst(2);
        l1.addfirst(3);
        l1.addfirst(4);
        l1.addfirst(5);
        l1.printlinklist();
        l1.head = l1.mergeSort(l1.head);
        l1.printlinklist();


        // head = new node(1);
        // head.next = new node(2);
        // head.next.next = new node(3);
        // head.next.next.next = new node(3);
        // head.next.next.next.next = head.next;

        // System.out.println( "is cycle exist "+isCycle());
        // removeCycle();
        // System.out.println(isCycle());


        

    }
}

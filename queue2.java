import java.util.Stack;
public class queue2 {
    // static class queue{
        //Queue
        // static Stack<Integer> s1 = new Stack<>();
        // static Stack<Integer> s2 = new Stack<>();

        // public static boolean isEmpty(){
        //     return s1.isEmpty();
        // }

        // public static void add(int data){
        //     while(!s1.isEmpty()){
        //         s2.push(s1.pop());
        //     }
        //     s1.push(data);
        //     while (!s2.isEmpty()) {
        //         s1.push(s2.pop());
                
        //     }
        // }
        // public static int remove(){
        //     if (isEmpty()) {
        //         System.out.println("queue is empty");
        //         return -1;
        //     }
        //     return s1.pop();
        // }
        // public static int peek(){
        //     if (isEmpty()) {
        //         System.out.println("queue is empty");
        //         return -1;
        //     }
        //     return s1.peek();
        // }

        //stack
        static class Stack{
            static Queue<Integer> q1 = new LinkedList<>();
            static Queue<Integer> q2 = new LinkedList<>();

            public static boolean isEmpty() {
                return q1.isEmpty() && q2.isEmpty();
            }

            public static void push( int data){
                if( !q1.isEmpty()){
                    q1.add(data);
                }else{
                    q2.add(data);
                }
            }

            //pop
            public static int pop(){
                if( isEmpty()){
                    System.out.println("empty stack");
                }
                int top = -1;

                //case1
                if(!q1.isEmpty()){
                    while( !q1.isEmpty()){
                        top = q1.rempve();
                        if(q1.isEmpty()){
                            break;
                        }
                    }
                }else{
                    //case2
                    while(!q2.isEmpty()){
                        top = q2.tremove();
                        if(q2.isEmpty()){
                            break;
                        }
                        q1.add(top);
                    }

                }
                return top;
            }

        }


    }
    public static void main(String[] args) {

        // queue
        // queue q=new queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }
    }
}
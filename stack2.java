import java.util.*;
public class stack2 {
    //ques1 push at the bottom
//     public static void pushAtBottom(Stack <Integer> s, int data){
//         if( s.isEmpty()){
//             s.push(data);
//             return ;
//         }
//         int top = s.pop();
//         pushAtBottom(s,data);
//         s.push(top);
//     }

//     // ques2  reverse the string
//     public static String reverseString( String str){
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while( idx < str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder("");
//         while( !s.isEmpty()){
//             char curr = s.pop();
//             result.append(curr);
//         }
//         return result.toString();
//     }

//     // ques3  reverse the stack
//     public static void  reverseStack(Stack<Integer> s){
//         if( s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s,top);
//     }
// public static void printStack(Stack<Integer>s){
//     while(!s.isEmpty()){
//         System.out.println(s.pop());
//     }
// }
// // ques 3 stock span 
// public static void stockSpan( int stocks[], int span[]){
//     Stack<Integer> s = new Stack<>();
//     span[0] = 1;
//     s.push(0);

//     for ( int i = 1; i<stocks.length;i++){
//         int currPrice = stocks[i];
//         while(!s.isEmpty() && currPrice > stocks[s.peek()]){
//             s.pop();
//         }
//         if(s.isEmpty()){
//             span[i] = i+1;
//         }else{
//             int prevHigh = s.peek();
//             span[i] = i - prevHigh;
//         }
//         s.push(i);
//     }
// }

// ques4 next generator element




public static void main(String[] args) {
    // Stack <Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);

    // pushAtBottom(s,4);
    // while(!s.isEmpty()){
    //     System.out.println(s.pop());
    // }

    // String str = " helloWorld";
    // String result = reverseString(str);
    // System.out.println(result);


    // Stack <Integer> s = new Stack<>();
    // s.push(1);
    // s.push(2);
    // s.push(3);
    // // printStack(s);
    // reverseStack(s);
    // printStack(s);


    // ques3 
    // int stocks[] = {  100,80,60,70,60,85,100};
    // int span[] = new int [stocks.length];
    // stockSpan( stocks,span);
    // for( int i = 0 ; i< span.length;i++){
    //     System.out.println(span[i]+ " ");
    // }


    // ques4 
    int arr[] = { 6,8,0,1,3};
    Stack<Integer> s = new Stack<>();
    int nxtGreater[] = new int[arr.length];

    for( int i = arr.length -1;i>=0;i--){
        //while
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }
        //2 if-else
        if(s.isEmpty()){
            nxtGreater[i] = -1;

        }else{
            nxtGreater[i] =arr[s.peek()];        
        }
        //push in s
        s.push(i);

    }
    for( int i = 0;i<nxtGreater.length;i++){
        System.out.print(nxtGreater[i] +" ");
    }
    System.out.println();

    }
}

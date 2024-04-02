import java.util.*;
public class stack2 {
    //ques1 push at the bottom
    public static void pushAtBottom(Stack <Integer> s, int data){
        if( s.isEmpty()){
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    // ques2  reverse the string
    public static String reverseString( String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while( idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while( !s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    // ques3  reverse the stack
    public static void  reverseStack(Stack<Integer> s){
        if( s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
public static void printStack(Stack<Integer>s){
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
}




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


    Stack <Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    // printStack(s);
    reverseStack(s);
    printStack(s);
}
}

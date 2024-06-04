import java.util.*;
public class BST2 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if( root.data > val){
          root.left =   insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }
        return root;

    }
    public static void inorder(Node root){
        if( root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    //print in range
    public static void printInRange(Node root,int k1, int k2){
        if(root == null){
            return;
        }
        if( root.data >= k1 && root.data <= k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+ " ");
            printInRange(root.right,k1,k2);
        }
        else if( root.data < k1){
            printInRange(root.left,k1,k2);
        }
        else{
            printInRange(root.right, k1,k2);
        }
    }

    // root to leaf path
    public static void printPath(ArrayList<Integer>path){
        for(int i = 0 ; i< path.size() ;i++){
            System.out.print(path.get(i) + " ->");
        }
        System.out.println("Null");
    }
    public static void pathRoot2Leaf(Node root , ArrayList<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        pathRoot2Leaf(root.left,path);
        pathRoot2Leaf(root.right,path);
        path.remove(path.size() -1);

        }
        // is valid Bst
        public static boolean isValid(Node root ,Node min, Node max){
            if(root == null){
                return true;
            }
            if(min != null && root.data <= min.data){
                return false;
            }
            if(max!= null && root.data >= max.data){
                return false;
            }
            return isValid(root.left, min , root)
                   && isValid(root.right, root,max);
        }




    public static void main(String args[]){
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for( int i = 0 ;i<values.length;i++){
            root = insert(root,values[i]);
        }

        inorder(root);
        System.out.println();

        // printInRange(root,5,12);
        pathRoot2Leaf(root,new ArrayList<>());


        if(isValid(root,null,null)){
            System.out.println("valid");
        }else{
            System.out.println("not vliad");
        }
    }
}

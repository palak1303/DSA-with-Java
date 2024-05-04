import java.util.*;
public class BST3 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    // public static Node insert(Node root, int val){
    //     if(root == null){
    //         root = new Node(val);
    //         return root;
    //     }

    //     if( root.data > val){
    //       root.left =   insert(root.left,val);
    //     }else{
    //         root.right = insert(root.right,val);
    //     }
    //     return root;

    // }
    public static void inorder(Node root){
        if( root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
  
    // MIRROT IMAGE O(N)
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = createMirror(root.left); 
        Node rightMirror = createMirror(root.right);
        
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    //  SORTED ARRAY TO BALANCED BST
     public static Node  createBST(int arr[], int start,int end){
        if( start>end){
            return null;
        }
        int mid = (start+ end)/2;

        Node root = new Node(arr[mid]);
        root.left= createBST(arr,start,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;



     }    public static void main(String args[]){
        // int values[] = {8,5,3,6,10,11};
        // Node root = null;
        // for( int i = 0 ;i<values.length;i++){
        //     root = insert(root,values[i]);
        // }

        // inorder(root);
        // System.out.println();

        // root =createMirror(root);
        // preorder(root);

        // BST

       int arr[] = {3,5,6,8,10,11,12};
       Node root = createBST(arr, 0,arr.length-1);
       preorder(root);

    }
}
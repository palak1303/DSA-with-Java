import java.util.*;

public class binaryTree2 {
        static class Node{
         int data;
         Node left;
         Node right;
     
         Node( int data){
             this.data = data;
             this.left = null;
             this.right = null;
     
         }
    }

    // height
     public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh) +1;
    }
    // count of Node
     public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount +1;
     }
    //  sum of nodes
    public static int sum(Node root){
        if( root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int  rightsum = sum(root.right);
        return  leftsum + rightsum+root.data;
    }
   
    // Diameter of a tree  
    // approach 1   O(N^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftdia = diameter(root.left);
        int lefth = height(root.left);
        int rightdia = diameter(root.right);
        int righth = height(root.right);

        int selfdia = lefth + righth +1;

        return Math.max(selfdia , Math.max(leftdia,rightdia));
    }
    // approach2   O(N)
    static class Info{
        int dim;
        int ht;

        public Info(int dim, int ht){
            this.dim= dim;
            this.ht = ht;
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int dim = Math.max(Math.max(leftInfo.dim, rightInfo.dim), leftInfo.ht + rightInfo.ht +1);
        int ht = Math.max( leftInfo.ht, rightInfo.ht)+1;
         
        return new Info( dim,ht);
    }

    public static void main(String[] args) {
        /*
                 1
               /  \
              2    3
            /  \  / \
           4    5 6  7

        */ 

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.print("heigth = "+height(root));
        // System.out.print("count ="+ count(root));
        // System.out.print("sum = "+ sum(root));
        // System.out.print("diameter = "+ diameter(root));
        System.out.print("diameter = "+ diameter2(root).dim);
    }
 
}
import java.util.*;
public class binaryTree3 {
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

   // subtree?
   public static boolean isIdentical(Node node, Node subroot){
        if( node == null && subroot == null){
            return true;
        }else if( node ==null || subroot ==null || node.data != subroot.data){
            return false;
        }

        if( !isIdentical(node.left, subroot.left)){
            return false;
        }
        if( !isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
        
   }
   public static boolean isSubtree(Node root, Node subroot){
    if( root == null){
        return false;
    }
        if(root.data == subroot.data){
            if( isIdentical(root,subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
   }


//    TopView 
   static class Info{
    Node node;
    int hd;

    public Info(Node node, int hd){
        this.node = node;
        this.hd = hd;

    }
   }
    public static void topView ( Node root){
    // level order
        Queue<Info> q = new LinkedList<>();
        HashMap< Integer, Node> map = new HashMap<>();

        int min = 0 , max = 0;
        q.add(new Info(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
            if( !map.containsKey(curr.hd)){     //first time in my occuring
                 map.put(curr.hd, curr.node);
            }

            if(curr.node.left != null){
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }
            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(min, curr.hd+1);
            }
        }
    }
        for( int i = min; i<=max;i++){
            System.out.print(map.get(i).data+" ");
            // System.out.println();
        }
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

    /*
     *      2        1
           /  \
          4    5
    //  */
    // Node subroot = new Node(2);
    // subroot.left = new Node(4);
    // // subroot.right = new Node(5);

    // System.out.println(isSubtree(root, subroot));
    topView( root);
}
}

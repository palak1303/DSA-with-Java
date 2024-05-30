public class bstAVL{
    static class Node{
        int data , height;
        Node left, right;

        Node(int data){
            this.data = data;
            height = -1;
        }
    }
     public static Node root;

     public static int height(Node root){
        if(root == null)
            return 0;

        return root.height;
    }

    static int max(int a,int b){
        return(a>b)?a:b;
    }

    public static int getBalance(Node root){
        if(root ==null)
            return 0;
        return  height(root.left) - height(root.right);    
    }

    public static Node insert(Node root,int key){
        if(root == null)
            return new Node(key);

        if(key<root.data)
            root.left = insert(root.left,key);
        else if(key>root.data)
            root.right = insert(root.right,key);
        else
            return root;        //Dupliacte keys not allowed

            //update root height
        root.height = 1+ Math.max(height(root.left),height(root.right));
            
            // get root's balance height
        int bf = getBalance(root);

            // left left case
        if(bf>1 && key<root.left.data)
            return rightRotate(root);

            // right right case
        if(bf>-1 && key>root.right.data)
        return leftRotate(root);

            // left right case
        if(bf>1 && key>root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
            // right left case
        if(bf>1 && key>root.right.data){
            root.left = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;  //AVL balance
    }

    public static void preorder(Node root){
        if(root ==null)
            return ;

        System.out.println(root.data+"");
        preorder(root.left);
        preorder(root.right);
}  

    //right rotate subtree rooted with y
    public static Node rightRotate(Node y){
        Node x = y.left;
        Node T2 = x.right;
    // perform rotation
    x.right = y;
    y.left = T2;

    // update height
    y.height = max(height(y.left), height(y.right)) +1;
    x.height = max(height(x.left), height(x.right)) +1;

    // rteurn new root
    return x;

    }
    //left rotate subtree rooted with y
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;
    // perform rotation
    y.left = x;
    x.right = T2;

    // update height
    x.height = max(height(x.left), height(x.right)) +1;
    y.height = max(height(y.left), height(y.right)) +1;

    // rteurn new root
    return y;
    }

    public static void mian(String args[]){
        root = insert(root,10);
        root = insert(root,20);
        root = insert(root,30);
        root = insert(root,40);
        root = insert(root,50);
        root = insert(root,25);

        preorder(root);
    }
    
}

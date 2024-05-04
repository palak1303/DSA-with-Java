public class BST5 {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class Info{
        boolean isBST;
        int size;
        int min; 
        int max;

        public Info(boolean isBST, int size, int min , int max ){
            this.isBST = isBST;
            this.size = size;
            this.min = min; 
            this.max = max;

        }    
    }


    public static int maxBST = 0;

    public static Info largestBST(node root){
        if(root == null){
            return new Info(true,0,Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size +1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));


        if( root.data <= leftInfo.max || root.data>= rightInfo.min){
            return new Info(false,size,min,max);
        }
        if( leftInfo.isBST && rightInfo.isBST){
            maxBST = Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }
        return new Info(false, size, min,max);
    }

    public static void main(String[] args) {
        node root=new node(50);
        root.left=new node(30);
        root.left.left=new node(5);
        root.left.right=new node(20);
        
        root.right=new node(60);
        root.right.left=new node(45);
        root.right.right=new node(70);
        root.right.right.left=new node(65);
        root.right.right.right=new node(80);

        Info info = largestBST(root);
        System.out.println("largest BST = "+ maxBST);
    }
}
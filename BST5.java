 import java.util.*;
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

//    LARGEST BST
    public static int maxBST = 0;

    public static Info largestBST(node root){
        if(root == null){
            return new Info(true,0 ,Integer.MAX_VALUE,Integer.MIN_VALUE);
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

        // FOR MERGE
    public static void getInorder(node root, ArrayList<Integer> arr){
        if(root == null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
    public static node createBST (ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st +end)/2;
        node root = new node(arr.get(mid));
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1, end);
        return root;
    }
    // Merge 2BST
    public static node mergeBST(node root1, node root2){
        // step1
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1,arr1);
        // step2
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2,arr2);
        // maerge
        int i = 0 , j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i<arr1.size() && j< arr2.size()){
            if( arr1.get(i) <= arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while( i < arr1.size()){
            finalArr.add(arr1.get(i));
            i++;
        }
        while( j < arr2.size()){
            finalArr.add(arr2.get(j));
            j++;
        }
        // sorted -> balanced
        return createBST(finalArr ,0,finalArr.size()-1);


    }
    public static void preorder(node root){
        if(root == null){
            return ;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
        
  }


    public static void main(String[] args) {
        // node root=new node(50);
        // root.left=new node(30);
        // root.left.left=new node(5);
        // root.left.right=new node(20);
        
        // root.right=new node(60);
        // root.right.left=new node(45);
        // root.right.right=new node(70);
        // root.right.right.left=new node(65);
        // root.right.right.right=new node(80);


         node root1 = new node(2);
         root1.left = new node(1);
         root1.right = new node(4);

         node root2 = new node(9);
         root2.left = new node(3);
         root2.right = new node(12);

        node root = mergeBST(root1, root2);
        preorder(root);
        // Info info = largestBST(root);
        // System.out.println("largest BST = "+ maxBST);
    }
}
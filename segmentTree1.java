
// Segment tree
public class segmentTree1 {
    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static int buildST( int arr[], int st, int start , int end){
        if( start == end){
            tree[st] = arr[start];
            return arr[start];
        }
        int mid = (start + end)/2;
        buildST(arr,2*st+1,start,mid);  //left sibtere - 2*i+1
        buildST(arr,2*st+2,mid+1,end);  //right sibtere - 2*i+2
        tree[st] = tree[2*st+1] + tree[2*st+2];
        return tree[st];
    }

    public static void main(String agrs[]){
        int arr[] = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        init( n);
        buildST(arr, 0,0,n-1);

        for( int i = 0 ; i < tree.length ; i++){
            System.out.print(tree[i] + " ");
        }

    }
    
}

import java.util.PriorityQueue;

// nearby car
public class heap1 {
    static class cars implements Comparable<cars>{
        int distance;
        int i;
        public cars(int distance,int i){
            this.distance=distance;
            this.i=i;
        }
        @Override
        public int compareTo(cars c2){
            return this.distance-c2.distance;
        }
    }
    public static void nearbycar(int pts[][],int k){
        PriorityQueue<cars> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int dis=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new cars( dis,i));
        }
        for (int i = 0; i < k; i++) {
           System.out.println("C"+pq.remove().i); 
        }
    }
    // connectRopes
    public static void connectrope(int ropes[]){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for( int i = 0;i<ropes.length;i++){
            pq.add(ropes[i]);

        }
        int cost = 0;
        while(pq.size()>1){
            int min = pq.remove();
            int min2 = pq.remove();
            cost +=min + min2;
            pq.add(min+min2);
        }
        System.out.println("cost of connecting n ropes = "+ cost);
    }

    // weakest solider
    static class row implements Comparable<row>{
        int idx;
        int solider;

        public row(int solider, int idx){
            this.solider = solider;
            this.idx = idx;
        }
        
        @Override
        public int compareTo( row r2){
            if( this.solider == r2.solider){
                return this.idx - r2.idx;
            }else{
                return this.solider - r2.solider;
            }
        }
    }

    public static void weakest( int army[][], int k){
        PriorityQueue<row> pq = new PriorityQueue<>();

        for( int i=0;i< army.length;i++){
            int count = 0;
            for( int j= 0;j< army[0].length;j++){
                count += army[i][j] ==1 ? 1:0;
            }
            pq.add(new row(count,i));
        }
        
        for( int i= 0; i<k;i++){
           System.out.println("R"+ pq.remove().idx);
        }
  }

//   sliding window maximun
static class Pair implements Comparable<Pair>{
    int val;
    int idx;

public Pair(int val,int idx){
    this.val = val;
    this.idx = idx;
}

@Override
public int compareTo(Pair p2){
    //ascending
    //return this.val - p2.val;
    //descending
    return p2.val - this.val;

   }
}

public static void slidingWindow(int arr[], int k, int res[]){
    PriorityQueue<Pair> pq = new PriorityQueue<>();

        //1st window
        for( int i = 0; i<k; i++){
            pq.add(new Pair(arr[i],i));
        }

        res[0] = pq.peek().val;

        for(int i = k;i<arr.length;i++){
            while(pq.size() > 0&& pq.peek().idx <= (i-k)){
                pq.remove();
            }

            pq.add(new Pair(arr[i],i));
            res[i-k+1] = pq.peek().val;
        }

        //print
        for(int i = 0 ; i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
}


    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        // int k=2;
        // nearbycar(pts, k);

        int ropes[] = {2,3,3,4,6};
        // connectrope(ropes);

        int army[][]={{1,0,0,0},
                       {1,1,1,1},
                       {1,0,0,0},
                       {1,0,0,0}};
        // int k = 2;
        // weakest(army,k);

        int arr[]  = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int res[] = new int[arr.length - k+1];
        slidingWindow(arr,k,res);

    }
}
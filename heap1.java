

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
    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        // nearbycar(pts, k);

        int ropes[] = {2,3,3,4,6};
        connectrope(ropes);
    }
}

import java.util.*;
// cheapest flight within K stops
public class graph9 {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge( int s, int d,int w){
            this.src= s;
            this.dest = d;
            this.wt = w;
        }
    } 
    static void createGraph(int flights[][],ArrayList<Edge> graph[]){
        for( int i=0; i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for( int i=0 ; i<flights.length;i++){
            int src = flights[i][0];
            int dest = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src,dest,wt);
            graph[src].add(e);

        }       
    }
    
    static class Info{
        int v; 
        int cost;
        int stops;

        public Info(int v, int c, int s){
            this.v = v;
            this.cost = c;
            this.stops = s;
        }

    }

    public static int cheapestFlight(int V, int flights[][],int src, int dest, int k){
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(flights, graph);

        int dist[] = new int[graph.length];     //dist[i] -> src to i
        for( int i=0;i<graph.length;i++){
            if( i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean vis[] = new boolean[graph.length];
        Queue<Info> pq = new LinkedList<>();
        pq.add(new Info(src,0,0));
        //loop
        while(!pq.isEmpty()){
            Info curr = pq.remove();
            if(curr.stops >k){
                break;
            }
            for(int i=0;i< graph[curr.v].size();i++){
                Edge e = graph[curr.v].get(i);                    int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if( curr.cost+ wt  < dist[v]  && curr.stops <=k){   //update dist
                    dist[v] = curr.cost+ wt;
                    pq.add(new Info(v, dist[v], curr.stops +1));
                }
            }
        }  
    if( dist[dest] == Integer.MAX_VALUE){
        return -1;
    }
    else{
        return dist[dest];
        }
    }

public static void main(String args[]){
    int V = 4;
    int flight[][] = {{0,1, 100},{1,2,100}, {2,0,100},{1,3,600},{2,3,200}};
    int src = 0 , dest = 3, k=1;
    System.out.println(cheapestFlight(V, flight, src, dest, k));
    }
}

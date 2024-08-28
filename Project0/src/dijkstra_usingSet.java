import java.util.*;
public class dijkstra_usingSet {
    static class Pair implements Comparable<Pair>{
        int node;
        int distance;
        Pair(int node,int distance){
            this.node=node;
            this.distance=distance;
        }

        public int compareTo(Pair o) {
            return this.distance-o.distance;
        }
    }

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        TreeSet<Pair> pq=new TreeSet<>();
        int[] dist = new int[V];
        Arrays.fill(dist,(int)1e9);
        dist[S]=0;
        pq.add(new Pair(S,dist[S]));
        while(!pq.isEmpty()){
            Pair curr=pq.pollFirst();
            int curr_node=curr.node;
            int curr_dist=curr.distance;
            for(ArrayList<Integer> nbr:adj.get(curr_node)){
                int nbr_node=nbr.get(0);
                int nbr_wt=nbr.get(1);
                if(dist[nbr_node]>curr_dist+nbr_wt){
                    if(dist[nbr_node]!=(int)1e9){
                        pq.remove(new Pair(nbr_node,dist[nbr_node]));
                    }
                    dist[nbr_node]=curr_dist+nbr_wt;
                    pq.add(new Pair(nbr_node,dist[nbr_node]));
                }

            }
        }
        return dist;
    }
}

//Bellman-ford//
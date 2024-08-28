//import java.io.BufferedReader;p
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.*;
//import java.util.LinkedList;
//
//public class Graphf{
//    public static void main(String args[]) throws IOException{
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        String[] s = in.readLine().trim().split(" ");
//        int n = Integer.parseInt(s[0]); // vertices
//        int m = Integer.parseInt(s[1]); // edges
//        int[][] edges = new int[m][2];
//        for (int i = 0; i < m; i++) {
//            s = in.readLine().trim().split(" ");
//            edges[i][0] = Integer.parseInt(s[0]);
//            edges[i][1] = Integer.parseInt(s[1]);
//        }
//        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
//        createAdjList(adjList, n, edges);
//        // Output the adjacency list to verify
//        for (int i = 0; i < adjList.size(); i++) {
//            System.out.print(i + ": ");
//            for (int j = 0; j < adjList.get(i).size(); j++) {
//                System.out.print(adjList.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
//        // bfs(adjList,0);
//        bfs_all(adjList);
//    }
//    private static void createAdjList(ArrayList<ArrayList<Integer>> adjList, int n, int[][] edges) {
//        for (int i = 0; i < n; i++) {
//            adjList.add(new ArrayList<Integer>());
//        }
//        for (int i = 0; i < edges.length; i++) {
//            int u = edges[i][0];
//            int v = edges[i][1];
//            adjList.get(u).add(v);  // For undirected graph
//            adjList.get(v).add(u);  // Add both directions
//        }
//    }
//    //? traverse
//    public static void bfs(ArrayList<ArrayList<Integer>> graph,int s,boolean[] visited){
//        Queue<Integer> q = new LinkedList<>();
//        // boolean visited[] = new boolean[graph.size()];
//        //* add source
//        q.add(s);
//        //* to prevent infinite loop because of same element we use visited
//        visited[s] = true;
//        while(!q.isEmpty()){
//            int curr = q.remove();
//            System.out.println(curr);
//            ArrayList<Integer> nbr_lis = graph.get(curr);
//            for(Integer nbr : nbr_lis){
//                if(!visited[nbr]){
//                    q.add(nbr);
//                    visited[nbr] = true;
//                }
//            }
//        }
//    }
//    public static void bfs_all(ArrayList<ArrayList<Integer>> graph){
//        int V = graph.size();
//        boolean visited[] = new boolean[V];
//        for (int i = 0; i < V; i++){
//            if (visited[i] == false){
//                bfs(graph, i,visited);
//            }
//        }
//    }
//    //? count of connected  components
//    public static int bfsCount(ArrayList<ArrayList<Integer>> graph,int s){
//        int count=0;
//        Queue<Integer> q = new LinkedList<>();
//        boolean visited[] = new boolean[graph.size()];
//        //* add source
//        q.add(s);
//        //* to prevent infinite loop because of same element we use visited
//        visited[s] = true;
//        while(!q.isEmpty()){
//            int curr = q.remove();
//            // System.out.println(curr);
//            count++;
//            ArrayList<Integer> nbr_lis = graph.get(curr);
//            for(Integer nbr : nbr_lis){
//                if(!visited[nbr]){
//                    q.add(nbr);
//                    visited[nbr] = true;
//                }
//            }
//        }
//        return count;
//    }
//}
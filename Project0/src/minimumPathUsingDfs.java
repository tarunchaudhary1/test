import java.util.*;

public class minimumPathUsingDfs {
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=5;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
//        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(1);
        adj.get(3).add(5);
        adj.get(4).add(1);
        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(5).add(3);
        boolean[] visited = new boolean[6];
        dfs(adj,visited,3,1,0);
        System.out.println(min);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int target,int curr,int dis){
        if(visited[curr]==true) return ;
        if(curr==target) {
            min = Math.min(dis, min);
            return;
        }

        for(int ele : adj.get(curr)){
            visited[curr]=true;
            dfs(adj,visited,target,ele,dis+1);
        }
    }
}

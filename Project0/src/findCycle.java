import java.util.ArrayList;

public class findCycle {
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
        for(int i=1;i<=5;i++){
            if(dfs(adj,visited,i,-1)){
                System.out.println("Cycle is present");
                break;
            }
        }

    }
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int curr,int parent){
        visited[curr]=true;
        for(int ele:adj.get(curr)){
            if(visited[ele]==false){
                if(dfs(adj,visited,ele,curr)){
                    return true;
                }
            }
            else if(parent!=curr){
                return true;
            }
        }
        return false;
    }
}

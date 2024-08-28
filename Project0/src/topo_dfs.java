import java.util.*;

public class topo_dfs {
    public static void main(String[] args) {

    }
    public static void dfs(boolean[] visited, ArrayList<ArrayList<Integer>> lis,Stack<Integer> st,int curr){
        
        visited[curr]=true;
        for(int ele:lis.get(curr)){
            if(!visited[ele]){
                dfs(visited,lis,st,ele);
            }
        }
        st.push(curr);
    }
}

import java.util.Arrays;

public class disjointSets {
    public static Integer[] parent;
    public static Integer[] rank;
    public static int find(int n){
        if(parent[n]==n) return n;
        return parent[n]=find(parent[n]);
    }

    public static void initialize(int n){
        parent = new Integer[n+1];
        rank = new Integer[n+1];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }
    public static void union(int u,int v){
        int ulp_u = find(u);
        int ulp_v = find(v);
        if(ulp_v == ulp_u) return;
        if(rank[ulp_u]<=rank[ulp_v]){
            parent[ulp_u] = ulp_v;
            rank[ulp_v]++;
        }
        else{
            parent[ulp_v]=ulp_u;
            rank[ulp_u]++;
        }
    }

    public static void main(String[] args) {
        initialize(5);
        union(1,2);
        union(3,4);
        union(2,5);
        System.out.println(Arrays.toString(parent));
    }
}

import java.util.*;
import java.util.LinkedList;

public class checkTraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> hm = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            hm.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int src = scan.nextInt();
            int dist = scan.nextInt();
            hm.get(src).add(dist);
            hm.get(dist).add(src);
        }

        int[] check = new int[n];
        for (int i = 0; i < n; i++) {
            check[i] = scan.nextInt();
        }
        boolean isPossible = bfs(hm, check);
    }

    public static boolean bfs(ArrayList<ArrayList<Integer>> graph, int[] check) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.size()];
        HashSet<Integer> set = new HashSet<>();
        boolean possible = true;
        q.add(check[0]);
        visited[check[0]] = true;
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.println(curr);
            ArrayList<Integer> nbr_lis = graph.get(curr);
            for (Integer nbr : nbr_lis) {
                if (!visited[nbr]) {
                    q.add(nbr);
                    visited[nbr] = true;
                }
            }
        }
        return possible;
    }
}
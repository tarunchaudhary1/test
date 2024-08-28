import java.util.*;

public class perimeter_tree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < n - 2; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            hm.putIfAbsent(u, new ArrayList<>());
            hm.get(u).add(v);
            hm.putIfAbsent(v, new ArrayList<>());
            hm.get(v).add(u);
        }
    }
}

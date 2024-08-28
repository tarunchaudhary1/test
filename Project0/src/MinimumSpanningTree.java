import java.util.*;

public class MinimumSpanningTree {
    public static class Element implements Comparable<Element> {
        int src;
        int dest;
        int weight;

        Element(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(Element o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

    public static Integer[] parent;
    public static Integer[] rank;

    public static int find(int n) {
        if (parent[n] == n) return n;
        return parent[n] = find(parent[n]);
    }

    public static void initialize(int n) {
        parent = new Integer[n + 1];
        rank = new Integer[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public static boolean union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);
        if (rootU == rootV) return false;

        if (rank[rootU] < rank[rootV]) {
            parent[rootU] = rootV;
        } else if (rank[rootU] > rank[rootV]) {
            parent[rootV] = rootU;
        } else {
            parent[rootV] = rootU;
            rank[rootU]++;
        }
        return true;
    }

    public static void main(String[] args) {
        int V = 5;
        Element e1 = new Element(0, 1, 5);
        Element e2 = new Element(0, 2, 2);
        Element e3 = new Element(2, 1, 3);
        Element e4 = new Element(2, 3, 1);
        Element e5 = new Element(1, 3, 2);
        Element e6 = new Element(1, 4, 4);
        Element e7 = new Element(3, 4, 3);

        Element[] arr = {e1, e2, e3, e4, e5, e6, e7};
        Arrays.sort(arr);

        int totalWeight = 0;
        initialize(V);

        for (Element edge : arr) {
            if (union(edge.src, edge.dest)) {
                totalWeight += edge.weight;
            }
        }

        System.out.println("Total weight of MST: " + totalWeight);
    }
}

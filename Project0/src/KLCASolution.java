import java.util.*;

public class KLCASolution {

    // Function to create a binary tree from array representation
    public static Node createTree(int[] a, int i) {
        if (i >= a.length || a[i] == -1) return null;

        Node newNode = new Node(a[i]);
        newNode.left = createTree(a, 2 * i + 1);
        newNode.right = createTree(a, 2 * i + 2);

        return newNode;
    }

    // Function to find k-th ancestor of lowest common ancestor of nodes p and q
    public static int findKLCA(Node root, int p, int q, int k) {
        Node ans = new Node(-1);
        List<Node> ll = new ArrayList<>();
        hasPath(root, ll, p);
        List<Node> ll1 = new ArrayList<>();
        hasPath(root, ll1, q);
        List<Node> lis = new ArrayList<>();

        for (int i = ll.size() - 1 ; i >= 0; i--) {
            if (ll1.contains(ll.get(i))) {
                ans=ll.get(i);
                lis.add(ll.get(i));
            }
        }
        int ans1=-1;
        if(lis.size()>k){
            ans1=lis.get(k).data;
        }
        return ans1;
    }

    public static boolean hasPath(Node root, List<Node> arr, int x) {
        if (root == null) {
            return false;
        }
        arr.add(root);
        if (root.data == x) {
            return true;
        }
        if (hasPath(root.left, arr, x) || hasPath(root.right, arr, x)) {
            return true;
        }
        arr.remove(arr.size() - 1);
        return false;
    }



        // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read n, m and k
        int n = sc.nextInt(); // Size of array a
        int m = sc.nextInt(); // Number of pairs (p, q)
        int k = sc.nextInt();

        // Read array a
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // Read pairs (p, q)
        int[][] pairs = new int[m][2];
        for (int i = 0; i < m; i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }
        
        sc.close();
        
        // Create the binary tree
        Node root = createTree(a, 0);
        
        // Find k-th ancestor of lowest common ancestor for each pair (p, q)
        for (int i = 0; i < m; i++) {
            int p = pairs[i][0];
            int q = pairs[i][1];
            int lca = findKLCA(root, p, q, k);
            System.out.println(lca);
        }
    }
}


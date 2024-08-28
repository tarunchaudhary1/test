import java.util.*;

public class UnevenNodes{
    /**
     *
     * @param root      Root Node
     * @param k         Minimum difference in height of subtrees for uneven node
     * @return          Number of uneven nodes
     */
    public static int countUneven(Node root, int k,int[] arr){
        if(root ==null) return 0;
        int left = countUneven(root.left,k,arr)+1;
        int right = countUneven(root.right,k,arr)+1;
        if(Math.abs(left-right)>=k) arr[0]++;
        return Math.max(left,right);
    }

    public static Node createTree(int a[], int i){
        if(i >= a.length || a[i] == -1) return null;
        Node newnode = new Node(a[i]);
        newnode.left = createTree(a, 2*i+1);
        newnode.right = createTree(a, 2*i+2);
        return newnode;
    }
    public static void main(String args[]){
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];
        // read values
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        sc.close();
        Node root = createTree(a, 0);
        int[] arr = new int[1];
        int b=countUneven(root, k,arr);
        System.out.println(arr[0]);
    }
}

class Node {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
};
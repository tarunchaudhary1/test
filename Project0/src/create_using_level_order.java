import java.util.*;
import java.util.LinkedList;

public class create_using_level_order {
    class Node {
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public create_using_level_order(){
        Create_Tree();
    }
    Scanner sc = new Scanner(System.in);
    private void Create_Tree(){
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val=item;
        root=nn;


        Queue<Node> q=new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            Node rn=q.poll();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
                Node node = new Node();
                node.val=c1;
                rn.left=node;
                q.add(node);
            }
            if(c2!=-1){
                Node node = new Node();
                node.val=c2;
                rn.right=node;
                q.add(node);
            }
        }
    }
}

public class trees {
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val=val;
            left=right= null;
        }
    }

    public void printPreOrder(Node node){  
        if(node==null) return;

        System.out.println(node.val);
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    public void printPostOrder(Node node){
        if(node==null) return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.val);
    }
    public void printInOrder(Node node){
        if(node==null) return;

        printInOrder(node.left);
        System.out.println(node.val);
        printInOrder(node.right);
    }

    public static void main(String[] args) {

    }

}


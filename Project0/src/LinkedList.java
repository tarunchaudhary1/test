import java.util.Scanner;

public class LinkedList {
    class Node {
        Node next;
        int data;
        Node(){}

        Node (int data){
            this.data = data;
        }
    }

    Node head;
    Node tail;
    int size = 0;

    public void add(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            size++;
            return;
        }

        tail.next = newnode;
        tail = tail.next;
        size++;
    }

    public void display (){
        Node currnode = head;
        while (currnode != null){
            System.out.print(currnode.data + "-->");
            currnode = currnode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        for(int i=0; i<n; i++){
            int a=sc.nextInt();
            ll.add(a);
        }
        ll.display();
    }

}
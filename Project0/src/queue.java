import java.util.*;
public class queue {
    private int[] arr;
    private int front;
    private int size;
    public queue(){
        arr = new int[5];
    }
    public queue(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public int size(){
        return size;
    }
    public void Enqueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("BKL queue full h");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=item;
        size++;
    }
    public int Dequeue(){
        int v=arr[front];
        front=(front+1)%arr.length;
        size--;
        return v;
    }
    public int getFront() {
        int v=arr[front];
        return v;
    }

}

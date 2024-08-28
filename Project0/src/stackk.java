import java.util.*;
public class stackk {
    private int[] arr;
    private int idx;
    public stackk(){
        arr = new int[5];
    }
    public stackk(int n){
        arr = new int[n];
    }
    public boolean isEmpty(){
        return idx==0;
    }
    public void push(int item) throws Exception{
        if(isFull()){
            throw new Exception("BKL stack full h");
        }
        arr[idx]=item;
        idx++;
    }

    private boolean isFull() {
        return idx==arr.length;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("BKL stack empty h");
        }
        idx--;
        return arr[idx];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("BKL stack empty h");
        }
        return arr[idx-1];
    }
    public void Display(){
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

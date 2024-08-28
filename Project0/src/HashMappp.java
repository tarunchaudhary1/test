import java.util.Collections;
import java.util.PriorityQueue;

public class HashMappp {
    public static class MedianPriorityQueue{
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        public MedianPriorityQueue(){
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }
        public void add(int val){
            if(right.size()>0 && val > right.peek()){
                right.add(val);
            }
            else{
                left.add(val);
            }
            if(left.size() - right.size() == 2){
                right.add(left.size());
            } else if (right.size()-left.size() == 2) {
                left.add(right.remove());
            }
        }
        public int remove(){
            if(this.size() == 0){
                System.out.println("Underflow");
                return -1;
            }
            if(left.size() >= right.size()){
                return left.remove();
            }
            else{
                return right.remove();
            }
        }
        public int peek(){
            if(this.size() == 0){
                System.out.println("Underflow");
                return -1;
            }
            if(left.size() >= right.size()){
                return left.peek();
            }
            else{
                return right.peek();
            }
        }
        public int size(){
            return left.size() + right.size();
        }
    }

    public static void main(String[] args) {
        MedianPriorityQueue m = new MedianPriorityQueue();
        m.add(5);
        m.add(10);
        m.add(15);
        m.add(20);
        System.out.println(m.peek());
    }
}


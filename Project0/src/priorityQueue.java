import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {

    }
    static class Student implements Comparable<Student>{
        String name;
        int age;
        public Student(String name,int age){
            this.name = name;
            this.age = age;
        }
        public int compareTo(Student o){
            if(o.age==this.age){
                return o.name.compareTo(this.name);
            }
            return o.age-this.age;
        }
    }
    public static int kthLargest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
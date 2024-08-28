import java.util.*;

public class kthSmallestFromScratch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i<arr.length;i++){
            if(pq.peek()>arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }

        System.out.println(pq.peek());
    }
}


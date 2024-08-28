import java.util.ArrayList;

public class heap {
    public static int left_child(int x){
        return 2*x+1;
    }
    public static int right_child(int x){
        return 2*x+2;
    }public static int parent(int x){
        return (int)Math.floor((x-1)/2);
    }
    public static void insert(ArrayList<Integer> heap,int key){
        heap.add(key);
        int curr=heap.size()-1;
        int parent = parent(curr);
        while(parent>0 && heap.get(parent)>heap.get(curr)){
            int temp= heap.get(parent);
            heap.set(parent,heap.get(curr));
            heap.set(curr,temp);
            curr=parent;
            parent=parent(curr);
        }
    }
    public static void heapify(ArrayList<Integer> heap,int i){
        int smallest = i;
        int left = left_child(i);
        int right = right_child(i);
        int size = heap.size()-1;
        if(left<=size && heap.get(left)<heap.get(smallest)){
            smallest = left;
        }
        if(right<=size && heap.get(right)<heap.get(smallest)){
            smallest=right;
        }
        if(smallest!=i){
            int temp= heap.get(i);
            heap.set(i,heap.get(smallest));
            heap.set(smallest,temp);
            heapify(heap,smallest);
        }
    }
    public static int extractMin(ArrayList<Integer> heap){
        int size=heap.size();
        if(size==0) return Integer.MAX_VALUE;
        if(size==1) return heap.get(0);
        int temp= heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.set(heap.size()-1,temp);
        heapify(heap,0);

        return heap.size()-1;
    }
    public static void upHeapify(ArrayList<Integer> heap, int key, int i){
        heap.set(i,key);
        int parent = parent(i);
        while(parent>0 && heap.get(parent)>heap.get(i)){
            int temp= heap.get(parent);
            heap.set(parent,heap.get(i));
            heap.set(i,temp);
            i=parent;
            parent=parent(i);
        }
    }

    public static void makeValidHeap(ArrayList<Integer> heap) {
        for(int i=(int)Math.floor(heap.size()-2)/2;i>=0;i--){
            heapify(heap,heap.get(i));
        }
    }
    public static int[] heapSort(ArrayList<Integer> heap){
        int[] arr = new int[heap.size()];
        int i=0;
        while(heap.size()!=0){
            int ele = extractMin(heap);
            arr[i]=ele;
            heapify(heap,0);
        }
        return arr;
    }
}

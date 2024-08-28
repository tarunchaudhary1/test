import java.util.Arrays;
import java.util.Stack;

public class mergeOverlapping {
    static class Pair implements Comparable<Pair>{
        int st;
        int et;
        Pair(int st, int et){
            this.st = st;
            this.et = et;
        }

        @Override
        public int compareTo(Pair o) {
            if(this.st!=o.st){
                return this.st-o.st;
            }
            else {
                return this.et-o.et;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {22,28},
                {1,8},
                {25,27},
                {14,19},
                {27,30},
                {5,12}
        };
        Pair[] pairs =new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            pairs[i]=new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i=0;i<pairs.length;i++){
            if(i==0){
                st.push(pairs[i]);
            }
            else{
                Pair top = st.peek();
                if(pairs[i].st>top.et){
                    st.push(pairs[i]);
                }else{
                    top.et = Math.max(top.et,pairs[i].et);
                }
            }
        }
        Stack<Pair> rs = new Stack<>();
        while(st.size()>0){
            rs.push(st.pop());
        }
        while (rs.size()>0){
            Pair p =rs.pop();
            System.out.println(p.st+ " "+ p.et);
        }
    }
}

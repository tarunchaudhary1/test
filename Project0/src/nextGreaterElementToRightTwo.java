import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementToRightTwo {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,9,12,6,8,7};
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos = st.peek();
                nge[pos]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size()>0){
            int pos = st.peek();
            nge[pos]=-1;
            st.pop();
        }
        System.out.println(Arrays.toString(nge));
    }
}

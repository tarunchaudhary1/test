import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementToRight {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,9,12,6,8,7};
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for (int i= arr.length-2;i>=0;i--){
            //-a+
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(nge));
    }
}

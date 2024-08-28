import java.util.Arrays;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int[] arr = {2,5,9,3,1,12,6,8,7};
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        res[0]=1;
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                res[i]=i+1;
            }
            else{
                res[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}

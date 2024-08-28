import java.util.Stack;

public class celebrityProblem {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1,1,1},
                {1,0,1,0},
                {0,0,0,0},
                {1,1,1,0}
        };
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();
            if(arr[i][j]==1){
                st.push(j);
            }
            else{
                st.push(i);
            }
        }
        int potential = st.pop();
        for(int i=0;i<arr.length;i++){
            if(i!=potential){
                if(arr[i][potential]==0 || arr[potential][i]==1){
                    System.out.println("none");
                }
            }
        }
        System.out.println(potential);
    }
}

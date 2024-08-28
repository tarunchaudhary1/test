import java.util.Stack;

public class bracketsss {
    public static void main(String[] args) {
        String s = "((a+b)+((a+b)))";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}

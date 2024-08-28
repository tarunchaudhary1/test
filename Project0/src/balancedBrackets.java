import java.util.Stack;

public class balancedBrackets {
    public static void main(String[] args) {
        String s = "[(a+b)+{(c+d)+(e+f)}]";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='['||ch=='('||ch=='{'){
                st.push(ch);
            }
            else if(ch==']'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                } else if (st.peek()!='[') {
                    System.out.println(false);
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(ch==')'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                } else if (st.peek()!='(') {
                    System.out.println(false);
                    return;
                }
                else{
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0){
                    System.out.println(false);
                    return;
                } else if (st.peek()!='{') {
                    System.out.println(false);
                    return;
                }
                else{
                    st.pop();
                }
            }
        }
        System.out.println(st.size() == 0);

    }
}

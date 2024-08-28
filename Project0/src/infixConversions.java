import java.util.Stack;

public class infixConversions {
    public static void main(String[] args) {
        String s = "((5+4)*((2+8)/(1+4)))";
        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> ops = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                ops.push(ch);
            } else if((ch>='0' && ch<='9') || (ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')){
                post.push(ch+"");
                pre.push(ch+"");
            } else if(ch==')'){
                while(ops.peek() !='('){
                    char op = ops.pop();
                    String postv2=post.pop();
                    String postv1= post.pop();
                    String postv=postv1 + postv2 + op;
                    post.push(postv);
                    String prev2=pre.pop();
                    String prev1= pre.pop();
                    String prev=op + prev1 + prev2 ;
                    pre.push(prev);
                }
                ops.pop();
            } else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(ops.size()>0 && ops.peek() !='(' && precedence(ch)<=precedence(ops.peek())){
                    char op = ops.pop();
                    String postv2=post.pop();
                    String postv1= post.pop();
                    String postv=postv1 + postv2 + op;
                    post.push(postv);
                    String prev2=pre.pop();
                    String prev1= pre.pop();
                    String prev=op + prev1 + prev2 ;
                    pre.push(prev);
                }
                ops.push(ch);
            }
        }
        while(ops.size()>0){
            char op = ops.pop();
            String postv2=post.pop();
            String postv1= post.pop();
            String postv=postv1 + postv2 + op;
            post.push(postv);
            String prev2=pre.pop();
            String prev1= pre.pop();
            String prev=op + prev1 + prev2 ;
            pre.push(prev);
        }
        System.out.println(post.pop());
        System.out.println(pre.pop());
    }
    public static int precedence(char optor){
        if(optor=='+'){
            return 1;
        }
        else if(optor=='-'){
            return 1;
        }
        else if (optor=='*'){
            return 2;
        }
        else {
            return 2;
        }
    }
}

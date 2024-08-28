import java.util.Stack;

public class infixEvaluation {
    public static void main(String[] args) {
        String s = "((5+4)*((2+8)/(1+4)))";
        Stack<Integer> opnds = new Stack<>();
        Stack<Character> optor = new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                optor.push(ch);
            } else if (Character.isDigit(ch)) {
                opnds.push(ch-'0');
            }else if(ch==')'){
                while(optor.peek() !='('){
                    char optr=optor.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();

                    int  opv=operation(v1,v2,optr);
                    opnds.push(opv);
                }
                optor.pop();
            }else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                while(optor.size()>0 && optor.peek()!='(' && precedence(ch)<=precedence(optor.peek())){
                    char optr=optor.pop();
                    int v2=opnds.pop();
                    int v1=opnds.pop();

                    int  opv=operation(v1,v2,optr);
                    opnds.push(opv);
                }
                optor.push(ch);
            }
        }
        while(optor.size()!=0){
            char optr=optor.pop();
            int v2=opnds.pop();
            int v1=opnds.pop();

            int  opv=operation(v1,v2,optr);
            opnds.push(opv);
        }
        System.out.println(opnds.peek());
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
    public static int operation(int v1,int v2,char optor){
        if(optor=='+'){
            return v1+v2;
        }
        else if(optor=='-'){
            return v1-v2;
        }
        else if (optor=='*'){
            return v1*v2;
        }
        else {
            return v1/v2;
        }
    }
}

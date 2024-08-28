import java.util.Stack;

public class prefixEvaluation {
    public static void main(String[] args) {
        String s = "-+2/*6483";
        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v1=vs.pop();
                int v2=vs.pop();
                int val = operation(v1,v2,ch);
                vs.push(val);

                String iv1=is.pop();
                String iv2=is.pop();
                String ival = "("+iv1 + ch + iv2+")";
                is.push(ival);

                String pv1=ps.pop();
                String pv2=ps.pop();
                String pval = pv1  + pv2 + ch;
                ps.push(pval);
            }
            else{
                vs.push(ch-'0');
                is.push(ch+"");
                ps.push(ch+"");
            }
        }
        System.out.println( vs.peek() + "  " + is.peek() + "  " + ps.peek());
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

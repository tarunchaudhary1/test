import java.util.Stack;

public class minStack2 {
    public static class MinStack{
        Stack<Integer> data;
        int min;
        public MinStack(){
            data = new Stack<>();
        }
        int size() {
            return data.size();
        }
        void push(int val){
            if(data.size()==0){
                data.push(val);
                min = val;
            }
            else if(val>=min){
                data.push(val);
            }
            else{
                data.push(val + val - min);
                min = val;
            }
        }
        int pop(){
            if(size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                if(data.peek()>=min){
                    return data.pop();
                }
                else{
                    int ov =min;
                    min = 2*min -data.pop();
                    return ov;
                }
            }
        }
        int top(){
            if(size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                if(data.peek()>=min){
                    return data.peek();
                }
                else{
                    return min;
                }
            }
        }
        int min(){
            if(size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else {
                return min;
            }
        }
    }
}

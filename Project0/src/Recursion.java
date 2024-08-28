public class Recursion {
    public static void main(String[] args) {
        int a=2;
        int n=3;
//        System.out.println(pow(a,n));
//        pD(10);
        int[] arr={2,3,4,1,5,6,3,1};
//        System.out.println(item_index(arr,0));
//        System.out.println(rec_index(10));
        H_T_possibility(10,"");
    }
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        return pow(a,n-1)*a;
    }
    public static void pD(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        pD(n-1);
        System.out.println(n);
    }
    public static int item_index(int[] arr,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==1){
            return i;
        }
        return item_index(arr,i+1);
    }
    public static int rec_index(int n){
        if(n==0 || n==1){
            return n;
        }
        return rec_index(n-1) + rec_index(n-2);
    }
    public static void print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        print(ques.substring(1),ans);
        print(ques.substring(1),ans+ch);
    }
    public static void H_T_possibility(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
            H_T_possibility(n - 1, ans + 'H');
        }
        H_T_possibility(n-1,ans+'T');
    }
}
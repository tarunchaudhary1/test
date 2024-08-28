import java.util.ArrayList;
import java.util.List;

public class lexico_number {
    public static void main(String[] args) {
        int n=20;
        Counting(0,n);
        ans.remove(0);
        System.out.println(ans);

//        int n=3;
//        String src="A";
//        String hlp="B";
//        String des="C";
//        TOH(n,src,hlp,des);
    }
    static List<Integer> ans = new ArrayList<>();
    private static void Counting(int curr, int n) {
        if(curr> n){
            return;
        }
        ans.add(curr);
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            Counting(curr*10+i,n);
        }
    }
    private static void TOH(int n,String src, String hlp,String des){
        if(n==0){
            return;
        }
        TOH(n-1,src,des,hlp);
        System.out.println("MOVE "+n+"th disk from "+src+" to "+des);
        TOH(n-1,hlp,src,des);
    }
}

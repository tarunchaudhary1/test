import java.util.*;
public class contestt {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ans = rec(n);
        System.out.println(ans);
    }
    public static int rec(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int cnt=0;
        for(int i=1;i<=n;i++){
            cnt+=rec(n-i);
        }
        return cnt;
    }
}

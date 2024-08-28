import java.util.Scanner;

public class kthLongestOr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            int n = scan.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j]=scan.nextInt();
            }
            int ans=kthLongest(n,arr);
            System.out.println(ans);
        }
    }
    public static int kthLongest(int n,int[] arr){
        int start=0;
        int ans=0;
        int end=n;
        while(start<=end){
            int mid=(start+end)/2;
            if(check(n,arr,mid)==true){
                end=mid-1;
                ans=mid;
            }
            else{
                start=mid+1;
            }
        }

        return ans;
    }
    public static boolean check(int n,int[] arr,int len){
        int a=0;
        for(int i=0;i<len;i++){
            a^=arr[i];
        }
        for(int i=1;i<arr.length-len;i++){
            int b=0;
            for(int j=i;j<len+i;j++){
                b^=arr[j];
            }
            if(a!=b){
                return false;
            }
        }
        return true;
    }
}

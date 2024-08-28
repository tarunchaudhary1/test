import java.util.HashMap;
import java.util.Scanner;

public class balancedReminders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int n=scan.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++) arr[j]=scan.nextInt();
//            int ans=fun(arr);
//            System.out.println(ans);
        }
    }
//    public static int fun(int[] arr){
//        int[] rem=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            rem[i]=arr[i]%3;
//        }
//        int[] arr1=new int[3];
//        for(int i=0;i<rem.length;i++){
//            arr1[rem[i]]++;
//        }
//        int req=rem.length/3;
//        if(arr1[0]==arr1[1] && arr1[1]==arr1[2]) return 0;
//
//    }
}

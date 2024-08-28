import java.util.Scanner;

public class angryMonk {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int n= scan.nextInt();
            int k= scan.nextInt();
            int[] arr=new int[k];
            for(int j=0;j<k;j++) arr[j]=scan.nextInt();
            int steps=0;
            int ones=0;
            int max=0;
            for(int j=0;j<k;j++){
                if(arr[j]==1) ones++;
                else if(arr[j]>max) {
                    if(max>0) steps+=max-1;
                    ones+=max;
                    max=arr[j];
                }
                else {
                    steps+=arr[j]-1;
                    ones+=arr[j];
                }
            }
            steps+=ones;
            System.out.println(steps);
        }
    }
}

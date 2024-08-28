public class fiboMemoized {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibMemo(n,new int[n+1]));
        System.out.println(countPathsMemo(n,new int[n+1]));
        System.out.println(countPathsTab(10));
    }
    public static int fibMemo(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        System.out.println("hello"+n);
        int fib1 = fibMemo(n-1, dp);
        int fib2 = fibMemo(n-2,dp);
        int fibn = fib1 + fib2;
        dp[n]=fibn;
        return fibn;
    }
    public static int countPathsMemo(int n, int[] dp){
        if(n==0){
            return 1;
        }
        else if(n<0){
            return 0;
        }
        if(dp[n]>0){
            return dp[n];
        }
        int nm1=countPathsMemo(n-1,dp);
        int nm2=countPathsMemo(n-2,dp);
        int nm3 = countPathsMemo(n-3,dp);
        int cp = nm1+nm2+nm3;
        dp[n]=cp;
        return cp;
    }
    public static int countPathsTab(int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        return dp[n];
    }
    public static int countPathSpecificJump(int[] arr){
        int[] dp = new int[arr.length+1];
        dp[arr.length]=1;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=1;j<=arr[i] && i+j<dp.length;j++){
                dp[i]+=dp[i+j];
            }
        }
        return dp[0];
    }

}

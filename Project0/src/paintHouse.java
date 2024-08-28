public class paintHouse {
    public static void main(String[] args) {
        int n=4;
        int[][] arr = {
                {1,5,7},
                {5,8,4},
                {3,2,9},
                {1,2,4}
        };
        int[][] dp = new int[n][3];
        dp[0][0]=arr[0][0];
        dp[0][1]=arr[0][1];
        dp[0][2]=arr[0][2];
        for(int i=1;i<arr.length;i++){
            dp[i][0] = arr[i][0] + Math.min(dp[i-1][1],dp[i-1][2]);
            dp[i][1] = arr[i][1] + Math.min(dp[i-1][0],dp[i-1][2]);
            dp[i][2] = arr[i][2] + Math.min(dp[i-1][1],dp[i-1][0]);
        }
        System.out.println(Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2])));
    }
}

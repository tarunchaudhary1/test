public class goldfarm {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 4, 2, 8, 2},
                {4, 3, 6, 5, 0, 4},
                {1, 2, 4, 1, 4, 6},
                {2, 0, 7, 3, 2, 2},
                {3, 1, 5, 9, 2, 4},
                {2, 7, 0, 8, 5, 1}
        };
        System.out.println(goldmine(arr));
    }
    public static int goldmine(int[][] arr){
        int n=arr.length;
        int m = arr[0].length;
        int[][] dp = new int[n][m];
        for(int j=arr[0].length-1;j>=0;j--){
            for(int i=arr.length-1;i>=0;i--){
                if(j==arr[0].length-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==0){
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
                }
                else if(i==arr.length-1){
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
                }
                else{
                    dp[i][j]=arr[i][j]+Math.max(dp[i][j+1],Math.max(dp[i+1][j+1],dp[i-1][j+1]));
                }
            }
        }
        int max = dp[0][0];
        for(int i=1;i<dp.length;i++){
            if(dp[i][0]>max){
                max=dp[i][0];
            }
        }
        return max;
    }
}

public class coinChangeCombination {
    public static void main(String[] args) {
        int[] coins={2,3,5};
        int target = 7;
        int[] dp =new int[target+1];
        dp[0]=1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<dp.length;j++){
                dp[j]+=dp[j-coins[i]];
            }
        }
        System.out.println(dp[target]);
    }
}

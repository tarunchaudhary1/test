public class coinChangePermutation {
    public static void main(String[] args) {
        int[] coins={2,3,5,6};
        int target = 10;
        int[] dp =new int[target+1];
        dp[0]=1;
        for(int amt =1;amt<=target;amt++){
            for(int coin:coins){
                if(coin<=amt){
                    int ramt=amt-coin;
                    dp[amt]+=dp[ramt];
                }
            }
        }
        System.out.println(dp[target]);
    }
}

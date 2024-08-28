import java.util.*;

public class knapsack_01 {
    public static void main(String[] args) {
        int[] wt = {3,2,5};
        int[] val = {20,40,50};
        int maxCapacity=6;
        int[][] dp = new int[wt.length][maxCapacity+1];
        for(int[] arr :dp) Arrays.fill(arr,-1);
    }
    public static int knapsack(int[] wt,int[] val,int index,int k,int[][] dp){
        if(index==wt.length) return 0;
        if(dp[index][k]!=-1) return dp[index][k];
        int pick=0,not_pick=0;
        if(wt[index]<=k){
            pick = knapsack(wt,val,index+1,k-wt[index],dp)+val[index];
        }
        not_pick=knapsack(wt,val,index+1,k,dp);
        return dp[index][k] = Math.max(pick,not_pick);
    }
}

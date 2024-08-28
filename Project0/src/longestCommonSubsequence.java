import java.util.Arrays;

public class longestCommonSubsequence {
    public static void main(String[] args) {
        String s1="abcde";
        String s2="ace";
        int[][] dp = new int[s1.length()][s2.length()];
        for (int[] arr:dp) Arrays.fill(arr,-1);
    }
    public static int LCS(String s1,int i,String s2,int j,int[][] dp){
        if(i==s1.length() || j==s2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j] = LCS(s1,i+1,s2,j+1,dp) +1;
        else{
            return dp[i][j] = Math.max(LCS(s1,i+1,s2,j,dp),LCS(s1,i,s2,j+1,dp));
        }
    }
}
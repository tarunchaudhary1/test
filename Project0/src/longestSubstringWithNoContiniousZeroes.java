public class longestSubstringWithNoContiniousZeroes {
    public static void main(String[] args) {
        int n=4;
        System.out.println(longestSubstringWithNoContiniousZeroes1(n) + " " + longestSubstringWithNoContiniousZeroes2(n));
    }
    public static int longestSubstringWithNoContiniousZeroes1(int n){
        int[] dp0=new int[n+1];
        int[] dp1=new int[n+1];
        dp0[1]=1;
        dp1[1]=1;
        for(int i=2;i<=n;i++){
            dp1[i]=dp1[i-1]+dp0[i-1];
            dp0[i]=dp1[i-1];
        }
        return dp1[n]+dp0[n];
    }
    public static int longestSubstringWithNoContiniousZeroes2(int n){
        int oczeroes=1;
        int ocones=1;
        for(int i=2;i<=n;i++){
            int nczeros=ocones;
            int ncones=oczeroes+ocones;
            ocones=ncones;
            oczeroes=nczeros;
        }
        return ocones+oczeroes;
    }
}

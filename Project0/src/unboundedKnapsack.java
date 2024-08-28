public class unboundedKnapsack {
    public static void main(String[] args) {
        int n=5;
        int[] vals = {15,14,10,45,30};
        int[] wts = {2,5,1,3,4};
        int cap=7;
        int[] dp = new int[cap+1];
        dp[0]=0;
        for(int bagc=1;bagc<=cap;bagc++){
            int max=0;
            for(int i=0;i<n;i++){
                if(wts[i]<=bagc){
                    int rbagc=bagc-wts[i];
                    int rbagv=dp[rbagc];
                    int tbagv=rbagv+vals[i];
                    if(tbagv>max){
                        max=tbagv;
                    }
                }
            }
            dp[bagc]=max;
        }
        System.out.println(dp[cap]);
    }
}

public class black_white {
    public static void main(String[] args) {
        System.out.println(numOfWays(2,3));
    }
    public static long numOfWays(int N, int M)
    {
        int ans =0;
        for(int i=0;i<N;i++){
            int count=N*M-1;
            for(int j=0;j<M;j++){
                if(i-2>0 && j-1>0){
                    count--;
                }
                if(i-2>0 && j+1<M){
                    count--;
                }
                if(i-1>0 && j-2>0){
                    count--;
                }
                if(i+1<N && j-2>0){
                    count--;
                }
                if(i+2<N && j-1>0){
                    count--;
                }
                if(i+2<N && j+1<M){
                    count--;
                }
                if(i-1>0 && j+2<M){
                    count--;
                }
                if(i+1<N && j+2<M){
                    count--;
                }
                ans+=count;
            }
        }
        return ans % (int)(Math.pow(10,9)+7);
    }

}

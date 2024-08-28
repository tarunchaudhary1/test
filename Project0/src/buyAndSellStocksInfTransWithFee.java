public class buyAndSellStocksInfTransWithFee {
    public static void main(String[] args) {
        int n=11;
        int[] arr = {10,15,17,20,16,18,22,20,22,20,23,25};
        int fee=3;
        int bsp=-arr[0];
        int ssp=0;
        for(int i=1;i<arr.length;i++){
            int nbstp=0;
            int nssp=0;
            if(ssp-arr[i]>bsp){
                nbstp=ssp-arr[i];
            }
            else {
                nbstp=bsp;
            }
            if(bsp+arr[i]-fee>ssp){
                nssp=bsp+arr[i]-fee;
            }
            else {
                nssp=ssp;
            }
            bsp=nbstp;
            ssp=nssp;
        }
        System.out.println(ssp);
    }
}
